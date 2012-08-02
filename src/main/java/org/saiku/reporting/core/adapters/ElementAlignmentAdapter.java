/**
 * 
 */
package org.saiku.reporting.core.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.pentaho.reporting.engine.classic.core.ElementAlignment;
import org.pentaho.reporting.engine.classic.core.modules.parser.base.ReportParserUtil;
import org.pentaho.reporting.engine.classic.core.util.beans.ElementAlignmentValueConverter;

/**
 * @author mg
 *
 */
public class ElementAlignmentAdapter extends XmlAdapter<String,ElementAlignment> {
		public ElementAlignment unmarshal(String s) throws Exception {	
			return ReportParserUtil.parseVerticalElementAlignment(s, null);
		}
		public String marshal(ElementAlignment c) throws Exception {
			final ElementAlignmentValueConverter con = new ElementAlignmentValueConverter();
			return con.toAttributeValue(c);
		}
	}