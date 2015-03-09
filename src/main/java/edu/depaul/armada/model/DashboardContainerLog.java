package edu.depaul.armada.model;

import java.io.Serializable;


/**
 * DashboardContainerLog is used to transfer ContainerLog data to the Dashboard.
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
	public long cpuUsed;
	public long cpuTotal;

}
