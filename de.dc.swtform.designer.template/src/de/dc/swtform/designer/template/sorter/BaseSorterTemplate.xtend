package de.dc.swtform.designer.template.sorter

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil

class BaseSorterTemplate implements IGenerator<XTableViewer> {

	override gen(XTableViewer in) '''
		«val name = in.name.toFirstUpper»
		«val form = EcoreUtil.getRootContainer(in) as SwtForm»
		package «form.packagePath».sorter;
		
		import de.dc.swtform.designer.control.sorter.BaseViewerComparator;
		import de.dc.swtform.example.control.model.Base«name»Model;
		
		public abstract class Base«name»Sorter extends BaseViewerComparator<Base«name»Model> {
		
			@Override
			public int compare(Base«name»Model m1, Base«name»Model m2, int columnIndex) {
				switch (columnIndex) {
				«FOR i : 0..(in.columns.size-1)»
				case «i»:
					return sort«in.columns.get(i).name.toFirstUpper»(m1, m2);
				«ENDFOR»
				default:
					return 0;
				}
			}
			«FOR i : 0..(in.columns.size-1)»
			abstract int sort«in.columns.get(i).name.toFirstUpper»(Base«name»Model m1, Base«name»Model m2);
			«ENDFOR»
		}
	'''

}
