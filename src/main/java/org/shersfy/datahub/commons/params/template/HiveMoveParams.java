package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;

public class HiveMoveParams extends BaseJobParam{
	
	private int srcType;
	private List<HiveMoveParamsFrom> fromList;
	private List<HdfsParams> toHdfsList;
	private List<HiveParams> toHiveList;

	public HiveMoveParams(){
		fromList = new ArrayList<HiveMoveParamsFrom>();
		toHdfsList = new ArrayList<HdfsParams>();
		toHiveList = new ArrayList<HiveParams>();
	}

	public int getSrcType() {
		return srcType;
	}

	public void setSrcType(int srcType) {
		this.srcType = srcType;
	}

	public List<HiveMoveParamsFrom> getFromList() {
		return fromList;
	}

	public void setFromList(List<HiveMoveParamsFrom> fromList) {
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
