package com.gridedge.twitter.common;

import org.apache.spark.SparkConf;

public class SparkInfo {
	 private String master="local[*]";
	    private String appName="framework";
	    private String executorInstances;
	    private String executorMemory;
	    private String executorCores;
	    private String executorCoresMax;
	    private String taskCpus;    
	    private String driverMemory;
	    private String driverCore;
	    private String networkTimeout; 
	    private String defaultParallelism;
	    private String yarnJar;
	    private String executorClassPath;
	    private String applicationMasterMemory;
	    private String applicationMasterCore;
	    private String dynamicAllocation;
	    private String yarnQueue;
	    private String memoryFraction;
	    
	        
	  public String getExecutorCoresMax() {
			return executorCoresMax;
		}
		public void setExecutorCoresMax(String executorCoresMax) {
			this.executorCoresMax = executorCoresMax;
		}
		public String getTaskCpus() {
			return taskCpus;
		}
		public void setTaskCpus(String taskCpus) {
			this.taskCpus = taskCpus;
		}
	public String getMemoryFraction() {
			return memoryFraction;
		}
		public void setMemoryFraction(String memoryFraction) {
			this.memoryFraction = memoryFraction;
		}
		
		public void setYarnQueue(String yarnQueue) {
	        this.yarnQueue = yarnQueue;
	    }
	    public String getYarnQueue() {
	        return yarnQueue;
	    }
	    public void setDynamicAllocation(String dynamicAllocation) {
	        this.dynamicAllocation = dynamicAllocation;
	    }
	    public String getDynamicAllocation() {
	        return dynamicAllocation;
	    }
	    
	    public void setApplicationMasterCore(String applicationMasterCore) {
	        this.applicationMasterCore = applicationMasterCore;
	    }
	    public String getApplicationMasterCore() {
	        return applicationMasterCore;
	    }
	    
	    public void setApplicationMasterMemory(String applicationMasterMemory) {
	        this.applicationMasterMemory = applicationMasterMemory;
	    }
	    public String getApplicationMasterMemory() {
	        return applicationMasterMemory;
	    }
	    
	    public void setExecutorClassPath(String executorClassPath) {
	        this.executorClassPath = executorClassPath;
	    }
	    public String getExecutorClassPath() {
	        return executorClassPath;
	    }
	    public void setExecutorInstances(String ExecutorInstances) {
	        this.executorInstances = ExecutorInstances;
	    }
	    public String getExecutorInstances() {
	        return executorInstances;
	    }
	    public void setYarnJar(String YarnJar) {
	        this.yarnJar = YarnJar;
	    }
	    public String getYarnJar() {
	        return yarnJar;
	    }
	    public void setDefaultParallelism(String value) {
	        this.defaultParallelism = value;
	    }
	    public String getDefaultParallelism() {
	        return defaultParallelism;
	    }
	    
	    public void setNetworkTimeout(String networkTimeout) {
	        this.networkTimeout = networkTimeout;
	    }
	    public String getNetworkTimeout() {
	        return networkTimeout;
	    }
	    public void setAppName(String appName) {
	        this.appName  = appName;
	    }
	    public String getAppName() {
	        return appName;
	    }
	    public String getMaster() {
	        return master;
	    }
	    public void setMaster(String master) {
	        this.master = master;
	    }
	    public String getExecutorMemory() {
	        return executorMemory;
	    }
	    public void setExecutorMemory(String executorMemory) {
	        this.executorMemory = executorMemory;
	    }
	    public String getExecutorCores() {
	        return executorCores;
	    }
	    public void setExecutorCores(String executorCores) {
	        this.executorCores = executorCores;
	    }
	    public String getDriverMemory() {
	        return driverMemory;
	    }
	    public void setDriverMemory(String driverMemory) {
	        this.driverMemory = driverMemory;
	    }
	    public String getDriverCore() {
	        return driverCore;
	    }
	    public void setDriverCore(String driverCore) {
	        this.driverCore = driverCore;
	    }
	    
	    public SparkConf getSparkConfiguration() {
	        SparkConf sparkConf = new SparkConf();
	        
	        sparkConf.setMaster(getMaster());
	        sparkConf.setAppName(getAppName());
	        
	        if (getExecutorMemory() != null) {sparkConf.set("spark.executor.memory", getExecutorMemory());};
	        if (getExecutorCores() != null) {sparkConf.set("spark.executor.cores", getExecutorCores());};
	        if (getExecutorCoresMax() != null) {sparkConf.set("spark.cores.max", getExecutorCoresMax());};
	        if (getTaskCpus() != null) {sparkConf.set("spark.task.cpus", getTaskCpus());};
	        if (getNetworkTimeout() != null) {sparkConf.set("spark.network.timeout", getNetworkTimeout());};
	        if (getDefaultParallelism() != null) {sparkConf.set("spark.default.parallelism", getDefaultParallelism());};
	        if (getYarnJar() != null) {sparkConf.set("spark.yarn.jar", getYarnJar());};
	        if (getMemoryFraction() != null) {sparkConf.set("spark.shuffle.memoryFraction", getMemoryFraction());};
	        if (getExecutorClassPath() != null) {sparkConf.set("spark.yarn.appMasterEnv.CLASSPATH", getExecutorClassPath());};
	        if (getApplicationMasterMemory() != null) {sparkConf.set("spark.yarn.am.memory", getApplicationMasterMemory());};
	        if (getApplicationMasterCore() != null) {sparkConf.set("spark.yarn.am.cores", getApplicationMasterCore());};
	        if (getYarnQueue() != null) {sparkConf.set("spark.yarn.queue", getYarnQueue());};

	        // if dynamic allocation of executor instance enabled
	        if (getDynamicAllocation().equalsIgnoreCase("true")) {
	            sparkConf.set("spark.dynamicAllocation.enabled", "true");
	            sparkConf.set("spark.shuffle.service.enabled", "true");
	        }
	        else {
	            if (getExecutorInstances() != null) {sparkConf.set("spark.executor.instances", getExecutorInstances());};
	        }
	        return sparkConf;
	    }
}
