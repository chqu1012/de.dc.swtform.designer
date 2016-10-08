package de.dc.swtform.designer.template;

import java.util.HashMap;
import java.util.Map;

import de.dc.swtform.designer.template.provider.LabelProviderTemplate;

public enum TemplateManager {
	Instance;
	
	private Map<Template ,IGenerator<?>> map = new HashMap<Template ,IGenerator<?>>();
	
	private TemplateManager() {
		map.put(Template.BaseControl, new BaseControlTemplate());
		map.put(Template.ExtendedBaseControl, new ExtendedControlTemplate());
		map.put(Template.TestControl, new TestControlTemplate());
		map.put(Template.LabelProvider, new LabelProviderTemplate());
	}
	
	public IGenerator get(Template tpl){
		return map.get(tpl);
	}
}
