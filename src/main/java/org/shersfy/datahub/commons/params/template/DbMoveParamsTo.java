package org.shersfy.datahub.commons.params.template;


public class DbMoveParamsTo extends BaseJobParam{

	private Long dbId;
	private String catalog;
	private String schema;
	private String tableName;

	public Long getDbId() {
		return dbId;
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

	public void setDbId(Long dbId) {
		this.dbId = dbId;
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

}
