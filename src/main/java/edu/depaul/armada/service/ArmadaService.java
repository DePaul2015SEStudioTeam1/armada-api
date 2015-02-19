/**
 * 
 */
package edu.depaul.armada.service;

import java.util.List;

import edu.depaul.armada.model.AgentContainerLog;
import edu.depaul.armada.model.DashboardPreference;

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
	
	/**
	 * Sends a list of new DashboardPreferences to armada
	 * 
	 * @param dashboardPreferences 	preferences we want to send
	 */
	void storePreferences(List<DashboardPreference> dashboardPreferences);
	
	/**
	 * Sends a new DashboardPreference instance to armada
	 * 
	 * @param dashboardPreference 	preference we want to send
	 */
	void storePreference(DashboardPreference dashboardpreference);
}
