package org.shersfy.datahub.commons.params.template;

import com.alibaba.fastjson.JSON;

public class BaseJobParam {
	
	private Long jobId;
	
	private Long logId;
	/**项目hdfs代理用户名**/
	private String appUser;

	private String name;

	public String getAppUser() {
		return appUser;
	}

	public void setAppUser(String appUser) {
		this.appUser = appUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getJobId() {
		return jobId;
	}

	public Long getLogId() {
		return logId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
