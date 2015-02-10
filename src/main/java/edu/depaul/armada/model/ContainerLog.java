package edu.depaul.armada.model;


/**
 * @author jplante jdavidson
 */
public class ContainerLog {

	private String containerUniqueId;
	private String timestamp;
	private long memUsage;
	private long totalCpuUsage;
	private long filesystemUsage;
	private long memTotal;
	private long totalCpu;
	private long totalFilesystem;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public long getMemUsage() {
		return memUsage;
	}

	public void setMemUsage(long memUsage) {
		this.memUsage = memUsage;
	}

	public long getTotalCpuUsage() {
		return totalCpuUsage;
	}

	public void setTotalCpuUsage(long totalCpuUsage) {
		this.totalCpuUsage = totalCpuUsage;
	}

	public long getFilesystemUsage() {
		return filesystemUsage;
	}

	public void setFilesystemUsage(long filesystemUsage) {
		this.filesystemUsage = filesystemUsage;
	}
	
	public long getMemTotal(){
		return memTotal;
	}
	
	public void setMemTotal(long memTotal) {
		this.memTotal = memTotal;
	}
	
	public long getTotalCpu() {
		return totalCpu;
	}
	
	public void setTotalCpu(long totalCpu) {
		this.totalCpu = totalCpu;
	}
	
	public long getTotalFilesystem(){
		return totalFilesystem;
	}
	
	public void setTotalFilesystem(long totalFilesystem){
		this.totalFilesystem = totalFilesystem;
	}
	
	public void setContainerUniqueId(String containerUniqueId) {
		this.containerUniqueId = containerUniqueId;
	}
	
	public String getContainerUniqueId() {
		return containerUniqueId;
	}
}
