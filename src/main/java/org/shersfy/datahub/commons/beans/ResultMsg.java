package org.shersfy.datahub.commons.beans;

import com.alibaba.fastjson.JSON;

/**
 * 返回信息
 */
public class ResultMsg {
	
    private String key;
	private String title;
	private String detail;
	private Object[] args;

	public ResultMsg() {
	}
	
	public ResultMsg(String key) {
		this.key = key;
	}

	public ResultMsg(String key, Object...args) {
		this.key = key;
		this.args = args;
	}
	

	public String getKey() {
		return key;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

}
