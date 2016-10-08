package de.dc.swtform.designer.template;

import java.util.HashMap;
import java.util.Map;

import de.dc.swtform.designer.filter.BaseFilterTemplate;
import de.dc.swtform.designer.filter.ExtendedFilterTemplate;
import de.dc.swtform.designer.template.model.BaseTableViewerModelTemplate;
import de.dc.swtform.designer.template.provider.BaseLabelProviderTemplate;
import de.dc.swtform.designer.template.provider.ExtendedLabelProviderTemplate;

public enum TemplateManager {
	Instance;
	
	private Map<Template ,IGenerator<?>> map = new HashMap<Template ,IGenerator<?>>();
	
	private TemplateManager() {
		map.put(Template.BaseControl, new BaseControlTemplate());
		map.put(Template.ExtendedBaseControl, new ExtendedControlTemplate());
		map.put(Template.TestControl, new TestControlTemplate());
		map.put(Template.TableViewerBaseLabelProvider, new BaseLabelProviderTemplate());
		map.put(Template.TableViewerExtendedLabelProvider, new ExtendedLabelProviderTemplate());
		map.put(Template.TableViewerModel, new BaseTableViewerModelTemplate());
		map.put(Template.TableViewerBaseFilter, new BaseFilterTemplate());
		map.put(Template.TableViewerExtendedFilter, new ExtendedFilterTemplate());
	}
	
	public IGenerator get(Template tpl){
		return map.get(tpl);
	}
}
