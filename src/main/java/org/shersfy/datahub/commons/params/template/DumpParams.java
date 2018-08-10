package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;

public class DumpParams extends BaseJobParam{

	private List<DumpSqlParams> fromList;
	private List<HdfsParams> toHdfsList;
	private List<HiveParams> toHiveList;
	
	public DumpParams(){
		fromList = new ArrayList<DumpSqlParams>();
		toHdfsList = new ArrayList<HdfsParams>();
		toHiveList = new ArrayList<HiveParams>();
	}

	public List<DumpSqlParams> getFromList() {
		return fromList;
	}

	public List<HdfsParams> getToHdfsList() {
		return toHdfsList;
	}

	public List<HiveParams> getToHiveList() {
		return toHiveList;
	}

	public void setFromList(List<DumpSqlParams> fromList) {
		this.fromList = fromList;
	}

	public void setToHdfsList(List<HdfsParams> toHdfsList) {
		this.toHdfsList = toHdfsList;
	}

	public void setToHiveList(List<HiveParams> toHiveList) {
		this.toHiveList = toHiveList;
	}


}
