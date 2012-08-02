package org.saiku.reporting.core.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="report")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportSpecification {
	
	@XmlElement(name="report-name")
	private String reportName;
	
	@XmlElementWrapper(name="report-titles")
	@XmlElement(name="label")
	private ArrayList<Label> reportTitles;
	
	@XmlElementWrapper(name="report-footers")
	@XmlElement(name="label")
	private ArrayList<Label> reportFooters;
	
	@XmlElementWrapper(name="page-headers")
	@XmlElement(name="label")
	private ArrayList<Label> pageHeaders;
	
	@XmlElementWrapper(name="page-footers")
	@XmlElement(name="label")
	private ArrayList<Label> pageFooters;
	
	@XmlElementWrapper(name="groups")
	@XmlElement(name="label")
	private ArrayList<Group> groups;

	@XmlElement(name="table-definition")
	private TableDefinition tableDefinition;
	
	@XmlElement(name="page-setup")
	private PageSetup pageSetup;

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public ArrayList<Label> getReportTitles() {
		return reportTitles;
	}

	public void setReportTitles(ArrayList<Label> reportTitles) {
		this.reportTitles = reportTitles;
	}

	public ArrayList<Label> getReportFooters() {
		return reportFooters;
	}

	public void setReportFooters(ArrayList<Label> reportFooters) {
		this.reportFooters = reportFooters;
	}

	public ArrayList<Label> getPageHeaders() {
		return pageHeaders;
	}

	public void setPageHeaders(ArrayList<Label> pageHeaders) {
		this.pageHeaders = pageHeaders;
	}

	public ArrayList<Label> getPageFooters() {
		return pageFooters;
	}

	public void setPageFooters(ArrayList<Label> pageFooters) {
		this.pageFooters = pageFooters;
	}

	public ArrayList<Group> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}

	public TableDefinition getTableDefinition() {
		return tableDefinition;
	}

	public void setTableDefinition(TableDefinition tableDefinition) {
		this.tableDefinition = tableDefinition;
	}

	public PageSetup getPageSetup() {
		return pageSetup;
	}

	public void setPageSetup(PageSetup pageSetup) {
		this.pageSetup = pageSetup;
	}

}
