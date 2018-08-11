package org.shersfy.datahub.commons.meta;
/**
 * 数据加载方式
 */
public enum LoadType {

	/**空**/
	Dummy,
	/**本地加载**/
	Local,
	/**HDFS加载**/
	HDFS;
	
	public int index(){
		return this.ordinal();
	}
	
	public static LoadType valueOf(int index){
		switch (index) {
		case 1:
			return Local;
		case 2:
			return HDFS;
		default:
			return Dummy;
		}
	}
}
