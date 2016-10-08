package de.dc.swtform.designer.template.provider

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil

class ExtendedLabelProviderTemplate implements IGenerator<XTableViewer> {
	
	override gen(XTableViewer in)'''
	«val name = in.name.toFirstUpper»
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	
	package «form.packagePath».provider;
	
	import org.eclipse.jface.viewers.ITableLabelProvider;
	import org.eclipse.jface.viewers.LabelProvider;
	import org.eclipse.swt.graphics.Image;
	
	import «form.packagePath».model.Base«name»Model;
	
	public class «name»LabelProvider extends Base«name»LabelProvider{
			«FOR i : 0..(in.columns.size-1)»
			@Override
			String getColumnText«i»(Base«name»Model model) {
				return model.get«in.columns.get(i).name.toFirstUpper»()+"";
			}
			«ENDFOR»
	}
	'''
}