package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;

/**
 * 本地文件上传任务参数
 */
public class LocalUploadParam extends BaseJobParam {

	private List<FileUploadParam> fromList;
	private List<HdfsParams> toHdfsList;
	
	public LocalUploadParam(){
		fromList = new ArrayList<>();
		toHdfsList = new ArrayList<>();
	}
	
	public List<FileUploadParam> getFromList() {
		return fromList;
	}
	public List<HdfsParams> getToHdfsList() {
		return toHdfsList;
	}
	public void setFromList(List<FileUploadParam> fromList) {
		this.fromList = fromList;
	}
	public void setToHdfsList(List<HdfsParams> toHdfsList) {
		this.toHdfsList = toHdfsList;
	}
	
	
}
