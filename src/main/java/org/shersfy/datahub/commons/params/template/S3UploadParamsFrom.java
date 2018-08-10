package org.shersfy.datahub.commons.params.template;

public class S3UploadParamsFrom extends BaseJobParam{
	
	
	/**S3连接ID**/
	private Long s3Id;
	/**S3 Bucket名称**/
	private String bucketName;
	/**S3 Object的key值**/
	private String key;
	/**S3 Object大小**/
	private long size;
	/**S3 是否目录**/
	private boolean directory;
	
	public S3UploadParamsFrom() {
		super();
	}
	public S3UploadParamsFrom(Long s3Id, String bucketName, String key) {
		super();
		this.s3Id = s3Id;
		this.bucketName = bucketName;
		this.key = key;
	}
	
	public Long getS3Id() {
		return s3Id;
	}
	public String getBucketName() {
		return bucketName;
	}
	public String getKey() {
		return key;
	}
	public void setS3Id(Long s3Id) {
		this.s3Id = s3Id;
	}
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public boolean isDirectory() {
		return directory;
	}
	public void setDirectory(boolean directory) {
		this.directory = directory;
	}
	

}
