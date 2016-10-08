package de.dc.swtform.designer.template.model

import de.dc.swtform.designer.template.IGenerator
import de.dc.swtform.xcore.widget.XTableViewer
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.swtform.xcore.model.SwtForm

class BaseTableViewerModelTemplate implements IGenerator<XTableViewer>{
	
	override gen(XTableViewer in) '''
	«val form = EcoreUtil.getRootContainer(in) as SwtForm»
	package «form.packagePath».model;
	
	public class Base«in.name.toFirstUpper»Model {
		
		public Base«in.name.toFirstUpper»Model() {
		}
		«val param = (in as XTableViewer).columns.map[typ+' '+name.toFirstLower].reduce[p1, p2|p1+', '+p2]»
		public Base«in.name.toFirstUpper»Model(«param») {
			«FOR c : in.columns»
			this.«c.name.toFirstLower»=«c.name.toFirstLower»;
			«ENDFOR»
		}
		
		«FOR c : in.columns»
		private «c.typ» «c.name.toFirstLower»;
		public void set«c.name.toFirstUpper»(«c.typ» «c.name.toFirstLower») {
			this.«c.name.toFirstLower» = «c.name.toFirstLower»;
		}
		public «c.typ» get«c.name.toFirstUpper»() {
			return «c.name.toFirstLower»;
		}
		«ENDFOR»
	}	
	'''
	
}