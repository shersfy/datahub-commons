package org.shersfy.datahub.commons.params.template;

import org.shersfy.datahub.commons.constant.Const;
import org.shersfy.datahub.commons.constant.Const.HiveTableFormat;

public class HiveParams extends BaseJobParam{
	
	/**hive数据库的连接ID**/
	private Long dbId;
	/**输出文件名全路径**/
	private String hdfsTmpDir;
	/**输出到Hive Catalog**/
	private String catalog;
	/**输出到Hive Schema**/
	private String schema;
	/**输出到Hive表**/
	private String tableName;
	/**输出Hive表分隔符**/
	private String columnSep;
	/**输出到Hive表分区**/
	private String partition;
	/**输出到Hive表分区多余字段默认值, 格式为{@link Partition}对象json字符串**/
	private String partitionExpDefault;
	/**文件存在是否覆盖, true覆盖, false追加**/
	private boolean override;
	/**是否是分区表, true是分区表, false不是分区表**/
	private boolean partitionTable;
	/**数据源输出 表格式**/
	private String format;
	/**是否替换换行符, true替换(默认), false不替换**/
	private boolean replaceEnter;
	/**是否使用临时表,true使用，false不使用**/
	private boolean useTmp;
	/**使用临时表分隔符**/
	private String useTmpColumnSep;
	/**替换字符串, 默认空格**/
	private String replacement;
	/**同步条件**/
	private String synchColumn;
	/**表类型**/
	private int tableType;
	
	public HiveParams(){
		this.columnSep 		= Const.COLUMN_SEP;
		this.replaceEnter 	= false;
		this.replacement 	= " ";
		this.tableType 		= HiveTableFormat.text.index();
	}
	
	public Long getDbId() {
		return dbId;
	}

	public void setDbId(Long dbId) {
		this.dbId = dbId;
	}

	public String getHdfsTmpDir() {
		return hdfsTmpDir;
	}

	public void setHdfsTmpDir(String hdfsTmpDir) {
		this.hdfsTmpDir = hdfsTmpDir;
	}

	public String getTableName() {
		return tableName;
	}

	public String getPartition() {
		return partition;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setPartition(String partition) {
		this.partition = partition;
	}
	public String getSchema() {
		return schema;
	}
	
	public void setSchema(String schema) {
		this.schema = schema;
	}
	
	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getColumnSep() {
		return columnSep;
	}

	public void setColumnSep(String columnSep) {
		this.columnSep = columnSep;
	}

	public boolean isOverride() {
		return override;
	}

	public void setOverride(boolean override) {
		this.override = override;
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
	
	public void setTableType(int type) {
		this.tableType = type;
	}
	
	public int getTableType() {
		return this.tableType;
	}

	public boolean isPartitionTable() {
		return partitionTable;
	}

	public void setPartitionTable(boolean partitionTable) {
		this.partitionTable = partitionTable;
	}

	/**
	 * 格式为{@link Partition}对象json字符串
	 * 
	 * @return
	 */
	public String getPartitionExpDefault() {
		return partitionExpDefault;
	}

	public String getUseTmpColumnSep() {
		return useTmpColumnSep;
	}

	public void setUseTmpColumnSep(String useTmpColumnSep) {
		this.useTmpColumnSep = useTmpColumnSep;
	}

	public boolean isUseTmp() {
		return useTmp;
	}

	public void setUseTmp(boolean useTmp) {
		this.useTmp = useTmp;
	}

	/**
	 * 
	 * @param partitionExpDefault 格式为{@link Partition}对象json字符串
	 */
	public void setPartitionExpDefault(String partitionExpDefault) {
		this.partitionExpDefault = partitionExpDefault;
	}

	public String getSynchColumn() {
		return synchColumn;
	}

	public void setSynchColumn(String synchColumn) {
		this.synchColumn = synchColumn;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
