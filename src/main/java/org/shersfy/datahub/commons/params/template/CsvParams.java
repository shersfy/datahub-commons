package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;

public class CsvParams extends BaseJobParam {
	
	private List<FileParams> fromList;
	private List<HdfsParams> toHdfsList;
	private List<HiveParams> toHiveList;

	public CsvParams(){
		fromList 	= new ArrayList<FileParams>();
		toHdfsList 	= new ArrayList<HdfsParams>();
		toHiveList 	= new ArrayList<HiveParams>();
	}

	public List<FileParams> getFromList() {
		return fromList;
	}

	public void setFromList(List<FileParams> fromList) {
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
