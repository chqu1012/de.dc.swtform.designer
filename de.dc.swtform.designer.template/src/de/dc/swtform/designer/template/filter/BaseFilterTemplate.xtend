package de.dc.swtform.designer.template.filter

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil

class BaseFilterTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in)'''
	«val name = in.name.toFirstUpper»
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».filter;
	
	import de.dc.swtform.designer.control.filter.BaseFilter;
	import de.dc.swtform.example.control.model.Base«name»Model;
	
	public abstract class Base«name»Filter extends BaseFilter<Base«name»Model>{
	
		@Override
		public boolean match(Base«name»Model element, String searchString) {
			«FOR c : in.columns»
			if(filter«c.name.toFirstUpper»(element, searchString)){
				return true;
			}
			«ENDFOR»
			return false;
		}
		«FOR c : in.columns»
		abstract boolean filter«c.name.toFirstUpper»(Base«name»Model element, String searchString);
		«ENDFOR»
	}
	'''
	
}
