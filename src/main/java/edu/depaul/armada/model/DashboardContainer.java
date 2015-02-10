/**
 * 
 */
package edu.depaul.armada.model;

import java.io.Serializable;

/**
 * DashboardContainer used in the UI
 * 
 * @author ptrzyna
 */
public class DashboardContainer implements Serializable {

	private static final long serialVersionUID = 1L;

	public String name;
	public String containerUniqueId;
	public String CAdvisorURL;
	public long containerId;
	public long memUsed;
	public long memTotal;
	public long filesystemUsed;
	public long filesystemTotal;
	public long cpuUsed;
	public long cpuTotal;
}
