package delegering;

public interface ISettings {
	boolean hasSetting(String name);
	Object getSetting(String name);
	void setSetting(String name, Object value);
}
