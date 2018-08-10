package org.shersfy.datahub.commons.params.template;

public class FileUploadParam extends BaseJobParam {
	/**解析前源文件路径**/
	private String srcPath;
	/**解析后的文件路径**/
	private String filePath;
    /** 文件大小 **/
    private Long size;
	/** 列分隔符 **/
	private String columnSep;
	/**解析后列数**/
	private long cols;
	/**解析后行数**/
	private long lines;
	
	public final String getSrcPath() {
		return srcPath;
	}
	public final String getFilePath() {
		return filePath;
	}
	public final Long getSize() {
		return size;
	}
	public final void setSize(Long size) {
		this.size = size;
	}
	public final String getColumnSep() {
		return columnSep;
	}
	public final long getCols() {
		return cols;
	}
	public final long getLines() {
		return lines;
	}
	public final void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}
	public final void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public final void setColumnSep(String columnSep) {
		this.columnSep = columnSep;
	}
	public final void setCols(long cols) {
		this.cols = cols;
	}
	public final void setLines(long lines) {
		this.lines = lines;
	}
}
