/**
 * 
 */
package edu.depaul.armada.service;

import java.util.List;

import edu.depaul.armada.model.AgentContainerLog;

/**
 * Used to interact with the armada "hub"
 * 
 * @author Paul A. Trzyna
 */
public interface ArmadaService {

	/**
	 * Sends a new AgentContainerLog instance to armada
	 * 
	 * @param containerLog	containerLog we want to send
	 */
	void send(AgentContainerLog containerLog);

	/**
	 * Sends a list of new AgentContainerLogss to armada
	 * 
	 * @param containerLogss	containerLogs we want to send
	 */
	void send(List<AgentContainerLog> containerLogs);
}
