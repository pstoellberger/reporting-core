package org.saiku.reporting.core.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Label can either end up as a label or a message field
 */
@XmlRootElement(name="text-label")
@XmlAccessorType(XmlAccessType.FIELD)
public class Label {
	
	@XmlElement(name="format")
	private ElementFormat format;

	/*
	 * value can be a text or a message-string
	 */
	@XmlElement(name="value")
	private String value;

	
	public ElementFormat getFormat() {
		return format;
	}

	public void setFormat(ElementFormat format) {
		this.format = format;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
