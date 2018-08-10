package org.shersfy.datahub.commons.params.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Excel数据源任务参数
 *
 */
public class ExcelParams extends BaseJobParam {

	private List<ExcelFileParams> fromList;
	private List<HdfsParams> toHdfsList;
	/**sheetIndex--hiveParam**/
	private List<Map<Integer, HiveParams>> toHiveList;

	public ExcelParams(){
		fromList 	= new ArrayList<ExcelFileParams>();
		toHdfsList 	= new ArrayList<HdfsParams>();
		toHiveList 	= new ArrayList<Map<Integer, HiveParams>>();
	}

	public List<ExcelFileParams> getFromList() {
		return fromList;
	}

	public void setFromList(List<ExcelFileParams> fromList) {
		this.fromList = fromList;
	}

	public List<HdfsParams> getToHdfsList() {
		return toHdfsList;
	}

	public void setToHdfsList(List<HdfsParams> toHdfsList) {
		this.toHdfsList = toHdfsList;
	}

	public List<Map<Integer, HiveParams>> getToHiveList() {
		return toHiveList;
	}

	public void setToHiveList(List<Map<Integer, HiveParams>> toHiveList) {
		this.toHiveList = toHiveList;
	}
	
}
