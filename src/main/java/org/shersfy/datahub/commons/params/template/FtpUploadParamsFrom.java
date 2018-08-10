package org.shersfy.datahub.commons.params.template;

import org.shersfy.datahub.commons.constant.ConstCommons.RenameType;
import org.shersfy.datahub.commons.constant.ConstCommons.SrcFileHandleType;
public class FtpUploadParamsFrom extends BaseJobParam{
	
	
	/**ftp连接ID**/
	private Long ftpId;
	/**使用通配符**/
	boolean usePattern;
	/**路径匹配规则("|"分隔)**/
	private String pathPattern;
	/**ftp文件路径**/
	private String filePath;
	/**是否递归**/
	private boolean recursive;
	/**是目录**/
	private boolean directory;
	/**Ftp文件大小**/
	private long size;
	/**Ftp源文件迁移后处理方式**/
	private int srcFileHandleType;
	/**Ftp源文件迁移后移动文件目录**/
	private String srcFileMoveDir;
	/**目标hdfs文件重命名类型**/
	private int tarRenameType;
	/**目标hdfs文件重命名格式**/
	private String tarRenameFormat;
	
	public FtpUploadParamsFrom() {
		super();
	}
	public FtpUploadParamsFrom(Long ftpId, String filePath) {
		super();
		this.ftpId = ftpId;
		this.filePath = filePath;
		this.srcFileHandleType = SrcFileHandleType.None.index();
		this.tarRenameType = RenameType.None.index();
	}
	
	public Long getFtpId() {
		return ftpId;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFtpId(Long ftpId) {
		this.ftpId = ftpId;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public boolean isUsePattern() {
		return usePattern;
	}
	public String getPathPattern() {
		return pathPattern;
	}
	public void setUsePattern(boolean usePattern) {
		this.usePattern = usePattern;
	}
	public void setPathPattern(String pathPattern) {
		this.pathPattern = pathPattern;
	}
	public int getSrcFileHandleType() {
		return srcFileHandleType;
	}
	public String getSrcFileMoveDir() {
		return srcFileMoveDir;
	}
	public void setSrcFileHandleType(int srcFileHandleType) {
		this.srcFileHandleType = srcFileHandleType;
	}
	public void setSrcFileMoveDir(String srcFileMoveDir) {
		this.srcFileMoveDir = srcFileMoveDir;
	}
	public int getTarRenameType() {
		return tarRenameType;
	}
	public String getTarRenameFormat() {
		return tarRenameFormat;
	}
	public void setTarRenameType(int tarRenameType) {
		this.tarRenameType = tarRenameType;
	}
	public void setTarRenameFormat(String tarRenameFormat) {
		this.tarRenameFormat = tarRenameFormat;
	}
	public boolean isRecursive() {
		return recursive;
	}
	public void setRecursive(boolean recursive) {
		this.recursive = recursive;
	}
	public boolean isDirectory() {
		return directory;
	}
	public void setDirectory(boolean directory) {
		this.directory = directory;
	}
	
	

}
