package edu.depaul.armada.model;

import java.io.Serializable;


/**
 * @author jplante jdavidson
 */
public class DashboardContainerLog implements Serializable {

	private static final long serialVersionUID = 1L;

	public String name;
	public String timestamp;
	public long memUsed;
	public long memTotal;
	public long diskUsed;
	public long diskTotal;
	public int cpuUsed;
	public int cpuTotal;

}
