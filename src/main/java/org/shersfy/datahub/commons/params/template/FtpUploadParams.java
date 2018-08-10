package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;

public class FtpUploadParams extends BaseJobParam {
	
	private List<FtpUploadParamsFrom> fromList;
	private List<HdfsParams> toHdfsList;
	
	public FtpUploadParams() {
		super();
		fromList = new ArrayList<>();
		toHdfsList = new ArrayList<>();
	}

	public List<FtpUploadParamsFrom> getFromList() {
		return fromList;
	}

	public List<HdfsParams> getToHdfsList() {
		return toHdfsList;
	}

	public void setFromList(List<FtpUploadParamsFrom> fromList) {
		this.fromList = fromList;
	}

	public void setToHdfsList(List<HdfsParams> toHdfsList) {
		this.toHdfsList = toHdfsList;
	}
	
	

}
