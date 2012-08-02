/**
 * 
 */
package org.saiku.reporting.core.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author mg
 *
 */
@XmlRootElement(name="rootband-format")
@XmlAccessorType(XmlAccessType.FIELD)
public class RootBandFormat extends ElementFormat {
	
	@XmlElement(name="repeat")
	private Boolean repeat;
	
	@XmlElement(name="visible")
    private boolean visible;
	  
	public void setRepeat(Boolean repeat) {
		this.repeat = repeat;
	}
		
	public Boolean getRepeat() {
		return repeat;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isVisible() {
		return visible;
	}

}
