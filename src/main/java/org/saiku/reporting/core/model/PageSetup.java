package org.saiku.reporting.core.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="page-setup")
@XmlAccessorType(XmlAccessType.FIELD)
public class PageSetup {
	
	@XmlElement(name="page-orientation")
	private int pageOrientation;
	
	@XmlElement(name="page-format")
	private String pageFormat;
	
	@XmlElement(name="top-margin")
	private int topMargin;
	
	@XmlElement(name="right-margin")
	private int rightMargin;
	
	@XmlElement(name="bottom-margin")
	private int bottomMargin;
	
	@XmlElement(name="left-margin")
	private int leftMargin;

	public int getPageOrientation() {
		return pageOrientation;
	}

	public void setPageOrientation(int pageOrientation) {
		this.pageOrientation = pageOrientation;
	}

	public String getPageFormat() {
		return pageFormat;
	}

	public void setPageFormat(String pageFormat) {
		this.pageFormat = pageFormat;
	}

	public int getTopMargin() {
		return topMargin;
	}

	public void setTopMargin(int topMargin) {
		this.topMargin = topMargin;
	}

	public int getRightMargin() {
		return rightMargin;
	}

	public void setRightMargin(int rightMargin) {
		this.rightMargin = rightMargin;
	}

	public int getBottomMargin() {
		return bottomMargin;
	}

	public void setBottomMargin(int bottomMargin) {
		this.bottomMargin = bottomMargin;
	}

	public int getLeftMargin() {
		return leftMargin;
	}

	public void setLeftMargin(int leftMargin) {
		this.leftMargin = leftMargin;
	}

}
