package de.dc.swtform.designer.template.sorter

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil

class ExtendedSorterTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in)'''
	«val name = in.name.toFirstUpper»
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».sorter;
	
	import «form.packagePath».model.*;
		
	public class «name»Sorter extends Base«name»Sorter{
		
		«FOR i : 0..(in.columns.size-1)»«val colName = in.columns.get(i).name.toFirstUpper»
		@Override
		int sort«colName»(Base«name»Model m1, Base«name»Model m2) {
			«IF in.columns.get(i).typ=="String"»
			return m1.get«colName»().compareTo(m2.get«colName»());
			«ELSEIF in.columns.get(i).typ=="int" || in.columns.get(i).typ=="Integer"»
			return m1.get«colName»()-m2.get«colName»();
			«ELSE»
			return m1.toString().compareTo(m2.toString());
			«ENDIF»
		}
		«ENDFOR»
	}
	'''
	
}