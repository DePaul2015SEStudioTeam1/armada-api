/**
 * 
 */
package edu.depaul.armada.model;

import java.io.Serializable;

/**
 * DashboardContainer used to transfer data to the dashboard.
 * 
 * @author ptrzyna
 */
public class DashboardContainer implements Serializable {

	private static final long serialVersionUID = 1L;

	public String name;
	public String containerUniqueId;
	public String cAdvisorURL;
	public long containerId;
	public long memUsed;
	public long memTotal;
	public long diskUsed;
	public long diskTotal;
	public long cpuUsed;
	public long cpuTotal;
}
