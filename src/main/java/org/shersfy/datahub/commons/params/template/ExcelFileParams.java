package org.shersfy.datahub.commons.params.template;

import java.util.List;

import org.shersfy.datahub.commons.meta.SheetMeta;

public class ExcelFileParams extends FileParams {

	private long totalRowSize;
	
	private List<SheetMeta> sheets;
	
	public List<SheetMeta> getSheets() {
		return sheets;
	}

	public void setSheets(List<SheetMeta> sheets) {
		this.sheets = sheets;
	}

	public long getTotalRowSize() {
		return totalRowSize;
	}

	public void setTotalRowSize(long totalRowSize) {
		this.totalRowSize = totalRowSize;
	}

}
