package delegering;

import java.util.HashMap;
import java.util.Map;

public class MapSettings implements ISettings {

	private Map<String, Object> settings = new HashMap<String, Object>();
	
	@Override
	public boolean hasSetting(String name) {
		return settings.containsKey(name);
	}

	@Override
	public Object getSetting(String name) {
		return settings.get(name);
	}

	@Override
	public void setSetting(String name, Object value) {
		settings.put(name, value);
	}
}
