package org.saiku.reporting.core.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data-field")
@XmlAccessorType(XmlAccessType.FIELD)
public class Field {
	
	/*
	 * usually this is the column header format
	 */
	@XmlElement(name="header-format")	
	private ElementFormat headerFormat;
	
	@XmlElement(name="field-format")
	private ElementFormat fieldFormat;
	
	@XmlElement(name="field-id")
	private String id;
	
	@XmlElement(name="field-name")
	private String name;
	
	@XmlElement(name="field-description")
	private String description;
	
	@XmlElement(name="mask")
	private String mask;
	
	@XmlElement(name="type")
	private String type;

	@XmlElement(name="hide-repeating")
	private boolean hideRepeating;
	
	@XmlElement(name="hide-on-report")
	private boolean hideOnReport;

	public ElementFormat getHeaderFormat() {
		return headerFormat;
	}

	public void setHeaderFormat(ElementFormat headerFormat) {
		this.headerFormat = headerFormat;
	}

	public ElementFormat getFieldFormat() {
		return fieldFormat;
	}

	public void setFieldFormat(ElementFormat fieldFormat) {
		this.fieldFormat = fieldFormat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHideRepeating() {
		return hideRepeating;
	}

	public void setHideRepeating(boolean hideRepeating) {
		this.hideRepeating = hideRepeating;
	}

	public boolean isHideOnReport() {
		return hideOnReport;
	}

	public void setHideOnReport(boolean hideOnReport) {
		this.hideOnReport = hideOnReport;
	}

}
