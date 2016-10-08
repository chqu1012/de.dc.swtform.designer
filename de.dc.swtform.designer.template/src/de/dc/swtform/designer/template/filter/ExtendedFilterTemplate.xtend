package de.dc.swtform.designer.template.filter

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil

class ExtendedFilterTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in)'''
	«val name = in.name.toFirstUpper»
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».filter;
	
	import «form.packagePath».model.*;
	
	public class «name»Filter extends Base«name»Filter{
		
		«FOR i : 0..(in.columns.size-1)»«val colName = in.columns.get(i).name.toFirstUpper»
		@Override
		boolean filter«colName»(Base«name»Model model, String searchString) {
			«IF in.columns.get(i).typ=="String"»
			return model.get«colName»().toLowerCase().contains(searchString.toLowerCase());
			«ELSEIF in.columns.get(i).typ=="int" || in.columns.get(i).typ=="Integer"»
			return (model.get«colName»()+"").contains(searchString.toLowerCase());
			«ELSE»
			return model.toString().toLowerCase().contains(searchString.toLowerCase());
			«ENDIF»
		}
		«ENDFOR»
	
	}
	'''
	
}
