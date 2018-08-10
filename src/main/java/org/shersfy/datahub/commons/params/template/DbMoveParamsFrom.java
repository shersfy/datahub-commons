package org.shersfy.datahub.commons.params.template;

import java.util.LinkedHashMap;

public class DbMoveParamsFrom extends BaseJobParam{

	private Long id;
	/**数据源输入catalog**/
	private String catalog;
	/**数据源输入 schema**/
	private String schema;
	/**数据源输入 表名**/
	private String tableName;
	/**数据源输入 表格式**/
	private String format;
	/**数据源输入 执行SQL语句**/
	private String sql;
	/**数据源输入 筛选条件(增量条件)**/
	private String whereSql;
	/**数据源输入 同步字段列{srcSynchColumn:源同步字段, tagSynchColumn:目标同步字段}**/
	private String synchColumnMap;
	/**字段映射 josn格式数组**/
	private String outputColumnsMap;
	/**已排序的字段映射**/
	private LinkedHashMap<String, String> outputColumnsMapSort;

	public Long getId() {
		return id;
	}

	public String getCatalog() {
		return catalog;
	}

	public String getSchema() {
		return schema;
	}

	public String getTableName() {
		return tableName;
	}

	public String getWhereSql() {
		return whereSql;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setWhereSql(String whereSql) {
		this.whereSql = whereSql;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getSynchColumnMap() {
		return synchColumnMap;
	}

	public void setSynchColumnMap(String synchColumnMap) {
		this.synchColumnMap = synchColumnMap;
	}

	public String getOutputColumnsMap() {
		return outputColumnsMap;
	}

	public void setOutputColumnsMap(String outputColumnsMap) {
		this.outputColumnsMap = outputColumnsMap;
	}

	public LinkedHashMap<String, String> getOutputColumnsMapSort() {
		return outputColumnsMapSort;
	}

	public void setOutputColumnsMapSort(LinkedHashMap<String, String> outputColumnsMapSort) {
		this.outputColumnsMapSort = outputColumnsMapSort;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
