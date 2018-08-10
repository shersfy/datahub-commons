package org.shersfy.datahub.commons.params.template;

import org.shersfy.datahub.commons.constant.ConstCommons;
import org.shersfy.datahub.commons.constant.ConstCommons.RenameType;
import org.shersfy.datahub.commons.constant.ConstCommons.TarFileHandleType;
import org.shersfy.datahub.commons.meta.HdfsMeta;

public class HdfsParams extends BaseJobParam{
	
	/**hdfs连接ID**/
	private Long hid;
	/**hdfs连接信息**/
	private HdfsMeta hdfsMeta;
	/**输出文件名全路径**/
	private String fileName;
	/**字段分隔符**/
	private String columnSep;
	/**文件存在是否覆盖, true追加, false覆盖**/
	private boolean isAppend;
	/**是否替换换行符, true替换(默认), false不替换**/
	private boolean replaceEnter;
	/**替换字符串, 默认空格**/
	private String replacement ;
	/**输出到目录是否合并文件**/
	private boolean merge;
	/**目标hdfs文件存在处理类型**/
	private int tarFileHandleType;
	/**目标hdfs文件存在重命名类型**/
	private int renameType;
	/**目标hdfs文件存在重命名格式**/
	private String renameFormat;
	
	public HdfsParams(){
		this.isAppend	= true;
		this.columnSep 	= ConstCommons.COLUMN_SEP;
		this.replaceEnter = false;
		this.replacement = "";
		this.merge = false;
		this.tarFileHandleType = TarFileHandleType.Append.index();
		this.renameType = RenameType.None.index();
	}
	
	public Long getHid() {
		return hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getFileName() {
		return fileName;
	}

	public String getColumnSep() {
		return columnSep;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setColumnSep(String columnSep) {
		this.columnSep = columnSep;
	}
	
	public boolean isAppend() {
		return isAppend;
	}
	
	public void setAppend(boolean isAppend) {
		this.isAppend = isAppend;
	}

	public boolean isReplaceEnter() {
		return replaceEnter;
	}

	public String getReplacement() {
		return replacement;
	}

	public void setReplaceEnter(boolean replaceEnter) {
		this.replaceEnter = replaceEnter;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}

	public boolean isMerge() {
		return merge;
	}

	public void setMerge(boolean merge) {
		this.merge = merge;
	}

	public final HdfsMeta getHdfsMeta() {
		return hdfsMeta;
	}

	public final void setHdfsMeta(HdfsMeta hdfsMeta) {
		this.hdfsMeta = hdfsMeta;
	}

	public int getTarFileHandleType() {
		return tarFileHandleType;
	}

	public int getRenameType() {
		return renameType;
	}

	public String getRenameFormat() {
		return renameFormat;
	}

	public void setTarFileHandleType(int tarFileHandleType) {
		this.tarFileHandleType = tarFileHandleType;
	}

	public void setRenameType(int renameType) {
		this.renameType = renameType;
	}

	public void setRenameFormat(String renameFormat) {
		this.renameFormat = renameFormat;
	}

}
