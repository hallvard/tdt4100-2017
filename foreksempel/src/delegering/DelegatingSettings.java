package delegering;

public class DelegatingSettings implements ISettings {

	private MapSettings local = new MapSettings();
	private DelegatingSettings defaults = null;
	
	public DelegatingSettings(DelegatingSettings defaults) {
		this.defaults = defaults;
	}
	
	@Override
	public boolean hasSetting(String name) {
		return false;
	}

	@Override
	public Object getSetting(String name) {
		return null;
	}

	@Override
	public void setSetting(String name, Object value) {

	}
}
