package org.saiku.reporting.core.model;

import java.awt.Color;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.pentaho.reporting.engine.classic.core.ElementAlignment;
import org.saiku.reporting.core.adapters.ColorAdapter;
import org.saiku.reporting.core.adapters.ElementAlignmentAdapter;

@XmlRootElement(name="element-format")
@XmlAccessorType(XmlAccessType.FIELD)
public class ElementFormat extends BaseElement {
	
	@XmlElement(name="font-name")
	private String fontName;

	@XmlElement(name="font-bold")
	private Boolean fontBold;
	
	@XmlElement(name="font-italic")
	private Boolean fontItalic;
	
	@XmlElement(name="font-underline")
	private Boolean fontUnderline;
	
	@XmlElement(name="font-strikethrough")
	private Boolean fontStrikethrough;
	
	@XmlElement(name="font-size")
	private Integer fontSize;
	
	@XmlJavaTypeAdapter(ColorAdapter.class)
	@XmlElement(name="font-color")
	private Color fontColor;

	@XmlJavaTypeAdapter(ColorAdapter.class)
	@XmlElement(name="background-color")
	private Color backgroundColor;
	
	@XmlElement(name="width")
	private Float width;
	
	@XmlElement(name="left-padding")
	private Float leftPadding;
	
	@XmlElement(name="right-padding")
	private Float rightPadding;

	@XmlJavaTypeAdapter(ElementAlignmentAdapter.class)
	@XmlElement(name="horizontal-alignment")
	private ElementAlignment horizontalAlignment;
	
	@XmlJavaTypeAdapter(ElementAlignmentAdapter.class)
	@XmlElement(name="vertical-alignment")
	private ElementAlignment verticalAlignment;

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public Boolean getFontBold() {
		return fontBold;
	}

	public void setFontBold(Boolean fontBold) {
		this.fontBold = fontBold;
	}

	public Boolean getFontItalic() {
		return fontItalic;
	}

	public void setFontItalic(Boolean fontItalic) {
		this.fontItalic = fontItalic;
	}

	public Boolean getFontUnderline() {
		return fontUnderline;
	}

	public void setFontUnderline(Boolean fontUnderline) {
		this.fontUnderline = fontUnderline;
	}

	public Boolean getFontStrikethrough() {
		return fontStrikethrough;
	}

	public void setFontStrikethrough(Boolean fontStrikethrough) {
		this.fontStrikethrough = fontStrikethrough;
	}

	public Integer getFontSize() {
		return fontSize;
	}

	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}

	public Color getFontColor() {
		return fontColor;
	}

	
	public void setFontColor(Color fontColor) {
		this.fontColor = fontColor;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getLeftPadding() {
		return leftPadding;
	}

	public void setLeftPadding(Float leftPadding) {
		this.leftPadding = leftPadding;
	}

	public Float getRightPadding() {
		return rightPadding;
	}

	public void setRightPadding(Float rightPadding) {
		this.rightPadding = rightPadding;
	}

	public ElementAlignment getHorizontalAlignment() {
		return horizontalAlignment;
	}

	public void setHorizontalAlignment(ElementAlignment horizontalAlignment) {
		this.horizontalAlignment = horizontalAlignment;
	}

	public ElementAlignment getVerticalAlignment() {
		return verticalAlignment;
	}

	public void setVerticalAlignment(ElementAlignment verticalAlignment) {
		this.verticalAlignment = verticalAlignment;
	}

}
