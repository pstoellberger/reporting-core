package org.saiku.reporting.core.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {
	
	@XmlElement(name="type")
	private GroupType type;
	
	public void setType(GroupType type) {
		this.type = type;
	}

	public GroupType getType() {
		return type;
	}


	
	

}
