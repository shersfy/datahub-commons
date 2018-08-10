package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;

public class HdfsMoveParams extends BaseJobParam{
	
	private List<HdfsMoveParamsFrom> fromList;
	private List<HdfsParams> toHdfsList;
	private List<HiveParams> toHiveList;
	
	public HdfsMoveParams(){
		fromList = new ArrayList<HdfsMoveParamsFrom>();
		toHdfsList = new ArrayList<HdfsParams>();
		toHiveList = new ArrayList<HiveParams>();
	}

	public List<HdfsMoveParamsFrom> getFromList() {
		return fromList;
	}

	public void setFromList(List<HdfsMoveParamsFrom> fromList) {
		this.fromList = fromList;
	}

	public List<HdfsParams> getToHdfsList() {
		return toHdfsList;
	}

	public void setToHdfsList(List<HdfsParams> toHdfsList) {
		this.toHdfsList = toHdfsList;
	}

	public List<HiveParams> getToHiveList() {
		return toHiveList;
	}

	public void setToHiveList(List<HiveParams> toHiveList) {
		this.toHiveList = toHiveList;
	}
	
	

}
