package org.shersfy.datahub.commons.params.template;

import org.shersfy.datahub.commons.beans.BaseBean;

public class FileParams extends BaseBean {
	
    /** 文件名 **/
    private String name;
    /** 列分隔符 **/
    private String columnSep;
    /** 文件大小 **/
    private Long size;
	/**解压前源文件路径**/
	private String srcPath;
	/**解压后的文件路径**/
	private String filePath;
	/**标题行编号**/
	private long headerLineNo;
	/**数据行开始位置编号**/
	private long dataLineNo;
	/**字段包围符**/
	private String fieldEnClosed;
	/**是否保留包围符**/
	private boolean isRemained;
	
	public FileParams(){
		headerLineNo 	= 1;
		dataLineNo 		= 1;
	}

	public String getColumnSep() {
		return columnSep;
	}

	public void setColumnSep(String columnSep) {
		this.columnSep = columnSep;
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

	public long getHeaderLineNo() {
		return headerLineNo;
	}

	public void setHeaderLineNo(long headerLineNo) {
		this.headerLineNo = headerLineNo;
	}

	public long getDataLineNo() {
		return dataLineNo;
	}

	public void setDataLineNo(long dataLineNo) {
		this.dataLineNo = dataLineNo;
	}
	
	public void setFieldEnClosed(String fieldEnClosed) {
		this.fieldEnClosed = fieldEnClosed;
	}
	
	public String getFieldEnClosed() {
		return this.fieldEnClosed;
	}
	
	public void setIsRemained(boolean isRemained) {
		this.isRemained = isRemained;
	}
	
	public boolean getIsRemained() {
		return this.isRemained;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
