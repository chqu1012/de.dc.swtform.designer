package de.dc.swtform.designer.filter

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil

class ExtendedFilterTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in)'''
	«val name = in.name.toFirstUpper»
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».filter;
	
	import de.dc.swtform.example.control.model.*;
	
	public class «name»Filter extends Base«name»Filter{
		
		@Override
		boolean filterName(Base«name»Model element, String searchString) {
			return element.getName().toLowerCase().contains(searchString.toLowerCase());
		}
		«FOR i : 0..(in.columns.size-1)»«val colName = in.columns.get(i).name.toFirstUpper»
		@Override
		String filter«colName»(Base«name»Model model, String searchString) {
			«IF in.columns.get(i).typ=="String"»
			return element.get«colName»().toLowerCase().contains(searchString.toLowerCase());
			«ELSEIF in.columns.get(i).typ=="int" || in.columns.get(i).typ=="Integer"»
			return (element.get«colName»()+"").contains(searchString.toLowerCase());
			«ELSE»
			return element.toString().toLowerCase().contains(searchString.toLowerCase());
			«ENDIF»
		}
		«ENDFOR»
	
	}
	'''
	
}