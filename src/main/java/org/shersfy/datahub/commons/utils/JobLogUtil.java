package org.shersfy.datahub.commons.utils;

import java.io.Serializable;

import org.shersfy.datahub.commons.meta.LogMeta;
import org.slf4j.event.Level;

import com.alibaba.fastjson.JSON;

public class JobLogUtil {
    
    private JobLogUtil() {}
    
    
    public static class JobLogPayload implements Serializable{
        
        /**
         * 
         */
        private static final long serialVersionUID = 1L;
        private Long jobId;
        private Long logId;
        private String content;
        
        public JobLogPayload(Long jobId, Long logId, String content) {
            super();
            this.jobId = jobId;
            this.logId = logId;
            this.content = content;
        }
        
        public Long getJobId() {
            return jobId;
        }
        public void setJobId(Long jobId) {
            this.jobId = jobId;
        }
        public Long getLogId() {
            return logId;
        }
        public void setLogId(Long logId) {
            this.logId = logId;
        }
        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }
        
    }
    
    
    public static JobLogPayload getMsgData(Level level, long jobId, long logId, String msg) {
        
        msg = msg == null?"":msg;
        msg = String.format("jobId=%s, logId=%s, %s", jobId, logId, msg);

        LogMeta meta = new LogMeta(level, msg);
        
        return new JobLogPayload(jobId, logId, meta.getLine());
    }

}
