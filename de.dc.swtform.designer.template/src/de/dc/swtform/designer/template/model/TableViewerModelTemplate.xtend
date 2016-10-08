package de.dc.swtform.designer.template.model

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.swtform.xcore.model.SwtForm

class TableViewerModelTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in) '''
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».model;
	
	public class «in.name.toFirstUpper»Model {
		
		«FOR c : in.columns»
		private «c.typ» «c.name.toFirstLower»;
		public void set «c.name.toFirstUpper»(«c.typ»  «c.name.toFirstLower») {
			this. «c.name.toFirstLower» =  «c.name.toFirstLower»;
		}
		public «c.typ» get«c.name.toFirstUpper»() {
			return  «c.name.toFirstLower»;
		}
		«ENDFOR»
	}	
	'''
	
}