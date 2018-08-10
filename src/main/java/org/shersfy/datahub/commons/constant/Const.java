package org.shersfy.datahub.commons.constant;

/**
 * 常量
 *
 */
public class Const {

    private Const(){
    }


    /**年份类型: yyyy**/
    public static final String yyyy     = "yyyy";
    /**年月类型: yyyyMM**/
    public static final String yyyyMM   = "yyyy/MM";
    /**日期统一格式:yyyy/MM/dd**/
    public static final String yyyyMMdd         = "yyyy/MM/dd";
    /**文件夹时间戳格式**/
    public static final String FOLDER_TIMESTAMP = "yyyyMMddHHmmssSSS";
    /**数据转string日期格式**/
    public static final String FORMAT_DATE      = "yyyy-MM-dd";
    /**数据转string日期时间格式**/
    public static final String FORMAT_DATETIME  = "yyyy-MM-dd HH:mm:ss";
    /**数据转string日期时间格式**/
    public static final String FORMAT_TIMESTAMP = "yyyy-MM-dd HH:mm:ss.SSS";
    /**日期时间统一格式:yyyy/MM/dd HH:mm:ss**/
    public static final String yyyyMMddHHmmss   = "yyyy/MM/dd HH:mm:ss";
    /**时间统一格式:HH:mm:ss**/
    public static final String HHmmss           = "HH:mm:ss";
    /**浮点型小数位默认保留30位数**/
    public static final String DEC_FORMAT       = "#.##############################";
    
    /**系统换行符**/
    public static final String LINE_SEP     = System.getProperty("line.separator", "\n");
    /**系统换行符匹配**/
    public static final String LINE_SEP_REG = "\r\n|\n|\r";
    public static final String COLUMN_SEP   = "\u0001";

    /**
     * 源文件处理方式
     *
     */
    public static enum SrcFileHandleType{
        
        None,
        Rename,
        Delete,
        Move;
        
        private String format;
        
        SrcFileHandleType(){}
        
        public int index(){
            return this.ordinal()+1;
        }
        
        public static SrcFileHandleType indexOf(int index){
            switch (index) {
            case 1:
                return None;
            case 2:
                return Rename;
            case 3:
                return Delete;
            case 4:
                return Move;

            default:
                break;
            }
            return None;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }
    }
    /**
     * 目标文件重名处理方式
     *
     */
    public static enum TarFileHandleType{
        
        Overwrite,
        Append,
        Skip,
        Rename;
        
        private String format;
        
        public static TarFileHandleType indexOf(int index){
            switch (index) {
            case 1:
                return Overwrite;
            case 2:
                return Append;
            case 3:
                return Skip;
            case 4:
                return Rename;

            default:
                break;
            }
            return Overwrite;
        }
        
        public int index(){
            return this.ordinal()+1;
        }
        
        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }
    }   
    
    /***
     * 文件名重命名类型
     *
     */
    public static enum RenameType{
        
        None(""),
        Number("_1"),
        Timestamp("_yyyyMMdd_HHmmss");
        
        private String format;
        
        RenameType (){
        }
        RenameType (String format){
            this.format = format;
        }
        
        public static RenameType indexOf(int index){
            switch (index) {
            case 1:
                return None;
            case 2:
                return Number;
            case 3:
                return Timestamp;
            default:
                break;
            }
            return None;
        }
        
        public int index(){
            return this.ordinal()+1;
        }
        
        public String getFormat() {
            return format;
        }
        public void setFormat(String format) {
            this.format = format;
        }
    }
    
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
    
    /**Hive表存储格式类型**/
    public static enum HiveTableFormat {
        
        text("TextInputFormat"),
        
        orc("OrcInputFormat"),
        
        parquet("MapredParquetInputFormat"),
        
        rcfile("RCFileInputFormat"),
        
        sequencefile("SequenceFileInputFormat");
        
        private String alias;
        
        HiveTableFormat(String alias){
            this.alias = alias;
        }
        
        public static HiveTableFormat indexOf(Integer index) {
            if (index == null) {
                return text;
            }
            switch (index) {
            case 0:
                return text;
            case 1:
                return orc;
            case 2:
                return parquet;
            case 3:
                return rcfile;
            case 4:
                return sequencefile;
            default:
                return text;
            }
        }
        
        public int index() {
            return this.ordinal();
        }

        public String alias() {
            return alias;
        }

    }

}
