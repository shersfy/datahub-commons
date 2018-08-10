package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;

public class S3UploadParams extends BaseJobParam {
	
	private List<S3UploadParamsFrom> fromList;
	private List<HdfsParams> toHdfsList;
	
	public S3UploadParams() {
		super();
		fromList = new ArrayList<>();
		toHdfsList = new ArrayList<>();
	}

	public List<S3UploadParamsFrom> getFromList() {
		return fromList;
	}

	public List<HdfsParams> getToHdfsList() {
		return toHdfsList;
	}

	public void setFromList(List<S3UploadParamsFrom> fromList) {
		this.fromList = fromList;
	}

	public void setToHdfsList(List<HdfsParams> toHdfsList) {
		this.toHdfsList = toHdfsList;
	}
	
	

}
