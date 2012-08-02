/**
 * 
 */
package org.saiku.reporting.core.builder;

import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.ReportPreProcessor;
import org.pentaho.reporting.engine.classic.core.ReportProcessingException;
import org.pentaho.reporting.engine.classic.core.SubReport;
import org.pentaho.reporting.engine.classic.core.states.datarow.DefaultFlowController;

/**
 * @author mg
 *
 */
public class ReportProcessor implements ReportPreProcessor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MasterReport performPreDataProcessing(MasterReport arg0,
			DefaultFlowController arg1) throws ReportProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public MasterReport performPreProcessing(MasterReport arg0,
			DefaultFlowController arg1) throws ReportProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public SubReport performPreProcessing(SubReport arg0,
			DefaultFlowController arg1) throws ReportProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new IllegalStateException();
		}
	}

}
