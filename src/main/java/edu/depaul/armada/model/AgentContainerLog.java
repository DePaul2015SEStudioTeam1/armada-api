/**
 * 
 */
package edu.depaul.armada.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * AgentContainerLog used for data transfer from the agent to armada
 * 
 * @author ptrzyna
 */
public class AgentContainerLog implements Serializable {

	private static final long serialVersionUID = 1L;

	public String name;
	public String containerUniqueId;
	public String cAdvisorURL;
	public long memUsed;
	public long memTotal;
	public long diskUsed;
	public long diskTotal;
	public int cpuUsed;
	public int cpuTotal;
	public Timestamp timestamp;

}
