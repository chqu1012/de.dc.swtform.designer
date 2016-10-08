package de.dc.swtform.designer.template.provider

import de.dc.swtform.xcore.widget.XTableViewer
import de.dc.swtform.designer.template.IGenerator
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.swtform.xcore.model.SwtForm

class LabelProviderTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in)'''
	«val name = in.name.toFirstUpper»
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».provider;
	
	import org.eclipse.jface.viewers.ITableLabelProvider;
	import org.eclipse.jface.viewers.LabelProvider;
	import org.eclipse.swt.graphics.Image;
	
	import «form.packagePath».model.«name»Model;
	
	public class «name»LabelProvider extends LabelProvider implements ITableLabelProvider {
	
		@Override
		public Image getColumnImage(Object o, int i) {
			return null;
		}
	
		@Override
		public String getColumnText(Object o, int i) {
			if (o instanceof «name»Model) {
				«name»Model model = («name»Model) o;
				switch (i) {
				«FOR i : 0..(in.columns.size-1)»
				case «i»:
					return model.get«in.columns.get(i).name.toFirstUpper»()+"";
				«ENDFOR»
				default:
					return "";
				}
			}
			return "";
		}
	}
	'''
}