package org.shersfy.datahub.commons.params.template;


/**
 * VO类
 */
public class DumpSqlParams  {
    /** 版本ID **/
    private Long vid;

    /** 表名称 **/
    private String tableName;

    /** 列分隔符 **/
    private String columnSep;

    /** 目标位置 **/
    private String destPath;

    /** 文件大小 **/
    private Long size;
    
	/**解析前源文件路径**/
	private String srcPath;
	
	/**解析后的文件路径**/
	private String filePath;
	
	/**解析后列数**/
	private long cols;
	
	/**解析后行数**/
	private long lines;

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnSep() {
        return columnSep;
    }

    public void setColumnSep(String columnSep) {
        this.columnSep = columnSep;
    }
    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getSrcPath() {
        return srcPath;
    }

    public void setSrcPath(String srcPath) {
        this.srcPath = srcPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getCols() {
        return cols;
    }

    public void setCols(long cols) {
        this.cols = cols;
    }

    public long getLines() {
        return lines;
    }

    public void setLines(long lines) {
        this.lines = lines;
    }
}
