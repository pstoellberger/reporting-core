package org.saiku.reporting.core.model;

import org.codehaus.jackson.annotate.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public abstract class TableDefinition {

	private RootBandFormat detailsHeaderBand;

	private RootBandFormat detailsFooterBand;

	public void setDetailsHeaderBand(RootBandFormat detailsHeaderBand) {
		this.detailsHeaderBand = detailsHeaderBand;
	}

	public RootBandFormat getDetailsHeaderBand() {
		return detailsHeaderBand;
	}

	public void setDetailsFooterBand(RootBandFormat detailsFooterBand) {
		this.detailsFooterBand = detailsFooterBand;
	}

	public RootBandFormat getDetailsFooterBand() {
		return detailsFooterBand;
	}

}
