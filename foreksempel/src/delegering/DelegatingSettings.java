package delegering;

public class DelegatingSettings implements ISettings {

	private ISettings local;
	private ISettings defaults = null;
	
	public DelegatingSettings(ISettings local, ISettings defaults) {
		if (local == null) {
			throw new IllegalArgumentException("local settings shouldn't be null");
		}
		this.local = local;
		this.defaults = defaults;
	}

	@Override
	public boolean hasSetting(String name) {
//		if (local.hasSetting(name)) {
//			return true;
//		} else if (defaults != null) {
//			return defaults.hasSetting(name);
//		} else {
//			return false;
//		}
		return local.hasSetting(name) || (defaults != null && defaults.hasSetting(name));
	}

	@Override
	public Object getSetting(String name) {
		if (local.hasSetting(name)) {
			return local.getSetting(name);
		} else if (defaults != null) {
			return defaults.getSetting(name);
		}
		return null;
//		return (local.hasSetting(name) ? local.getSetting(name) : (defaults != null ? defaults.getSetting(name) : null));
	}

	@Override
	public void setSetting(String name, Object value) {
		local.setSetting(name, value);
	}
	
	public static void main(String[] args) {
		ISettings globalSettings = new MapSettings();
		globalSettings.setSetting("font", "arial");
		globalSettings.setSetting("font-size", "12");
		System.out.println(globalSettings.getSetting("font"));
		System.out.println(globalSettings.getSetting("font-size"));
		
		ISettings mySettings = new DelegatingSettings(new MapSettings(), globalSettings);
		System.out.println(mySettings.getSetting("font"));
		System.out.println(mySettings.getSetting("font-size"));
		
		mySettings.setSetting("font", "dingbats");
		System.out.println(mySettings.getSetting("font"));
		System.out.println(mySettings.getSetting("font-size"));

		System.out.println(globalSettings.getSetting("font"));
		System.out.println(globalSettings.getSetting("font-size"));
	}
}
