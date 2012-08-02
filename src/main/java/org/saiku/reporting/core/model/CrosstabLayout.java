package org.saiku.reporting.core.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "crosstab-layout")
@XmlAccessorType(XmlAccessType.FIELD)
public class CrosstabLayout extends TableDefinition {

	@XmlElementWrapper(name = "column-groups")
	@XmlElement(name = "groups")
	private ArrayList<Group> columnGroups;

	@XmlElementWrapper(name = "row-groups")
	@XmlElement(name = "groups")
	private ArrayList<Group> rowGroups;

	@XmlElementWrapper(name = "measures")
	@XmlElement(name = "field")
	private ArrayList<Field> measures;

	public ArrayList<Group> getColumnGroups() {
		return columnGroups;
	}

	public void setColumnGroups(ArrayList<Group> columnGroups) {
		this.columnGroups = columnGroups;
	}

	public ArrayList<Group> getRowGroups() {
		return rowGroups;
	}

	public void setRowGroups(ArrayList<Group> rowGroups) {
		this.rowGroups = rowGroups;
	}

	public ArrayList<Field> getMeasures() {
		return measures;
	}

	public void setMeasures(ArrayList<Field> measures) {
		this.measures = measures;
	}

}
