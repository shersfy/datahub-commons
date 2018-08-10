package org.shersfy.datahub.commons.meta;

import java.util.ArrayList;
import java.util.List;

/**
 * 分区字段及分区值
 * @author PengYang
 * @date 2017-03-13
 *
 * @copyright Copyright Lenovo Corporation 2017 All Rights Reserved.
 */
public class PartitionMeta extends BaseMeta {
	
	private ColumnMeta column;
	
	private List<FieldData> parts;
	private List<String> values;

	public PartitionMeta() {
		super();
		this.parts = new ArrayList<>();
		this.values = new ArrayList<>();
	}

	public ColumnMeta getColumn() {
		return column;
	}

	public void setColumn(ColumnMeta column) {
		this.column = column;
	}

	public List<FieldData> getParts() {
		return parts;
	}

	public void setParts(List<FieldData> parts) {
		this.parts = parts;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}
	
}
