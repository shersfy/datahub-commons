package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;


public class DbMoveParams extends BaseJobParam{

	private int srcType;
	private List<DbMoveParamsFrom> fromList;
	private List<DbMoveParamsTo> toDbList;
	private List<HdfsParams> toHdfsList;
	private List<HiveParams> toHiveList;
	
	public DbMoveParams(){
		fromList = new ArrayList<DbMoveParamsFrom>();
		toDbList = new ArrayList<DbMoveParamsTo>();
		toHdfsList = new ArrayList<HdfsParams>();
		toHiveList = new ArrayList<HiveParams>();
	}

	public List<DbMoveParamsFrom> getFromList() {
		return fromList;
	}

	public List<DbMoveParamsTo> getToDbList() {
		return toDbList;
	}

	public List<HdfsParams> getToHdfsList() {
		return toHdfsList;
	}

	public List<HiveParams> getToHiveList() {
		return toHiveList;
	}

	public void setFromList(List<DbMoveParamsFrom> fromList) {
		this.fromList = fromList;
	}

	public void setToDbList(List<DbMoveParamsTo> toDbList) {
		this.toDbList = toDbList;
	}

	public void setToHdfsList(List<HdfsParams> toHdfsList) {
		this.toHdfsList = toHdfsList;
	}

	public void setToHiveList(List<HiveParams> toHiveList) {
		this.toHiveList = toHiveList;
	}

	public int getSrcType() {
		return srcType;
	}

	public void setSrcType(int srcType) {
		this.srcType = srcType;
	}

}
