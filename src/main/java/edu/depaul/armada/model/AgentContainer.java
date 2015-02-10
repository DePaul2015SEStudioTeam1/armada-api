/**
 * 
 */
package edu.depaul.armada.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * AgentContainer used in the UI
 * 
 * @author ptrzyna
 */
public class AgentContainer implements Serializable {

	private static final long serialVersionUID = 1L;

	public String name;
	public String containerUniqueId;
	public String cAdvisorURL;
	public long memUsed;
	public long memTotal;
	public long filesystemUsed;
	public long filesystemTotal;
	public long cpuUsed;
	public long cpu;
	public Timestamp timestamp;

}
