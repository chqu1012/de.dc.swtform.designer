package de.dc.swtform.designer.template.provider

import de.dc.swtform.xcore.widget.XTableViewer
import de.dc.swtform.designer.template.IGenerator
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.swtform.xcore.model.SwtForm

class BaseLabelProviderTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in)'''
	«val name = in.name.toFirstUpper»
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».provider;
	
	import org.eclipse.jface.viewers.ITableLabelProvider;
	import org.eclipse.jface.viewers.LabelProvider;
	import org.eclipse.swt.graphics.Image;
	
	import «form.packagePath».model.Base«name»Model;
	
	public abstract class Base«name»LabelProvider extends LabelProvider implements ITableLabelProvider {
	
		@Override
		public Image getColumnImage(Object o, int i) {
			return null;
		}
	
		@Override
		public String getColumnText(Object o, int i) {
			if (o instanceof Base«name»Model) {
				Base«name»Model model = (Base«name»Model) o;
				switch (i) {
				«FOR i : 0..(in.columns.size-1)»
				case «i»:
					return getColumnText«i»(model);
				«ENDFOR»
				default:
					return "";
				}
			}
			return "";
		}
		«FOR i : 0..(in.columns.size-1)»
		abstract String getColumnText«i»(Base«name»Model model);
		«ENDFOR»
	}
	'''
}