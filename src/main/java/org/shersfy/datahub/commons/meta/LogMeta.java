package org.shersfy.datahub.commons.meta;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.shersfy.datahub.commons.utils.DateUtil;
import org.slf4j.event.Level;

/***
 * 行日志结构
 */
public class LogMeta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**日志级别**/
	private String level;
	/**日志时间yyyy/MM/dd HH:mm:ss**/
	private Date time;
	/**日志内容**/
	private String msg;
	
	public LogMeta() {
		super();
		this.level = Level.DEBUG.name();
		this.time = new Date();
		this.msg = StringUtils.EMPTY;
	}
	
	public LogMeta(Level level, String msg) {
		super();
		level = level==null?Level.DEBUG:level;
		this.level = level.name();
		this.msg = msg;
		this.time = new Date();
	}

	public String getLine() {
		/**日志行**/
		String line = "[%s] %s\t%s\n";
		line = String.format(line, level, DateUtil.format(time, "yyyy/MM/dd HH:mm:ss"), msg);
		return line;
	}
	
	public static String logtimeString(){
		return DateUtil.format(new Date(), "yyyy/MM/dd HH:mm:ss");
	}
	
	public static String logtimeString(Date date){
		return DateUtil.format(date, "yyyy/MM/dd HH:mm:ss");
	}

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTime() {
        return time;
    }

}
