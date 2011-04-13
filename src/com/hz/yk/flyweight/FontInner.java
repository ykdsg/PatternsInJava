package com.hz.yk.flyweight;

/**
 * 内部状态
 * 
 * @author Administrator
 * 
 */
public class FontInner {

	private String fontString;

	private String status;

	public FontInner(String fontString, String status) {
		this.setFontString(fontString);
		this.setStatus(status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFontString() {
		return fontString;
	}

	public void setFontString(String fontString) {
		this.fontString = fontString;
	}

}
