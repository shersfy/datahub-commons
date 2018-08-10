package org.shersfy.datahub.commons.params.template;

public class HdfsMoveParamsFrom extends BaseJobParam{

	private Long id;
	/**输入文件或文件夹全路径**/
	private String hdfsPath;
	
	public HdfsMoveParamsFrom(){
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getHdfsPath() {
		return hdfsPath;
	}

	public void setHdfsPath(String hdfsPath) {
		this.hdfsPath = hdfsPath;
	}
	
	
}
