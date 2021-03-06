package org.shersfy.datahub.commons.meta;

public class FtpMeta extends BaseMeta {
	/** 主机名称 **/
	private String host;
	/** 端口号 **/
	private Integer port;
    /** 用户名 **/
    private String userName;
    /** 密码 **/
    private String password;
    /** 协议类型 **/
    private FTPProtocolType protocolType;
    /**FTP协议类型**/
    public static enum FTPProtocolType{

        /**简单文件传输协议**/
        FTP,
        /**SSH文件传输协议**/
        SFTP;

        public static FTPProtocolType indexOf(int index){
            switch (index) {
            case 1:
                return FTP;
            case 2:
                return SFTP;
            }
            return FTP;
        }
        
        public int index(){
            return this.ordinal()+1;
        }
    }

    public FtpMeta() {
		super();
		this.protocolType = FTPProtocolType.FTP;
	}
    
    public FtpMeta(String host, Integer port, String userName, String password) {
    	this();
    	this.host = host;
    	this.port = port;
    	this.userName = userName;
    	this.password = password;
    }
    

	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

	public FTPProtocolType getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(FTPProtocolType protocolType) {
		this.protocolType = protocolType;
	}

}