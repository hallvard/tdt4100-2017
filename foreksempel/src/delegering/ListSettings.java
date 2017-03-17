package delegering;

import java.util.ArrayList;
import java.util.List;

public class ListSettings implements ISettings {

	private List<Object> settings = new ArrayList<>();
	
	private int getPos(String name) {
		for (int i = 0; i < settings.size(); i += 2) {
			if (name.equals(settings.get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public boolean hasSetting(String name) {
		return getPos(name) >= 0;
	}

	@Override
	public Object getSetting(String name) {
		int pos = getPos(name);
		return (pos >= 0 ? settings.get(pos + 1) : null);
	}

	@Override
	public void setSetting(String name, Object value) {
		int pos = getPos(name);
		if (pos < 0) {
			settings.add(name);
			settings.add(value);
		} else {
			settings.set(pos + 1, value);
		}
	}
}
