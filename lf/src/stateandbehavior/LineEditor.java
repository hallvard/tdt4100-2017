package stateandbehavior;

public class LineEditor {

	String text = "";
	int insertionIndex = 0;
	
	String getText() {
		return text;
	}
	void setText(String text) {
		this.text = text;
	}
	int getInsertionIndex() {
		return insertionIndex;
	}
	void setInsertionIndex(int insertionIndex) {
		this.insertionIndex = insertionIndex;
	}
	
	@Override
	public String toString() {
		return String.format("[LineEditor \"%s|%s\"]", text.substring(0, insertionIndex), text.substring(insertionIndex));
	}

	void left() {
		if (insertionIndex > 0) {
			insertionIndex = insertionIndex - 1; 
		}
	}
	
	void right() {
		if (insertionIndex < text.length()) {
			insertionIndex = insertionIndex + 1;
		}
	}
	
	void insertString(String s) {
		text = text.substring(0, insertionIndex) + s + text.substring(insertionIndex);
		insertionIndex = insertionIndex + s.length();
	}
	
	void insert(Object o) {
		insertString(o.toString());
	}

	void deleteLeft() {
		if (insertionIndex > 0) {
			text = text.substring(0, insertionIndex - 1) + text.substring(insertionIndex);
			insertionIndex = insertionIndex - 1;
		}
	}
	
	void deleteRight() {
		if (insertionIndex < text.length()) {
			text = text.substring(0, insertionIndex) + text.substring(insertionIndex + 1);
		}
	}
}
