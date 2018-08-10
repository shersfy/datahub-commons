package org.shersfy.datahub.commons.params.template;

import org.shersfy.datahub.commons.constant.ConstCommons.TarFileHandleType;

public class HiveMoveParamsFrom extends DbMoveParamsFrom{
	
	/**是否使用增量同步**/
	private boolean useSynchronized;
	/**目标分区存在处理方式**/
	private int tarPartHandleType;
	/**源分区字符串**/
	private String partition;
	private boolean partitionTable;    
	
	public HiveMoveParamsFrom() {
		super();
		this.useSynchronized = false;
		this.tarPartHandleType = TarFileHandleType.Append.index();
	}


	public final String getPartition() {
		return partition;
	}

	public final void setPartition(String partition) {
		this.partition = partition;
	}

	public boolean isUseSynchronized() {
		return useSynchronized;
	}

	public int getTarPartHandleType() {
		return tarPartHandleType;
	}

	public void setUseSynchronized(boolean useSynchronized) {
		this.useSynchronized = useSynchronized;
	}

	public void setTarPartHandleType(int tarPartHandleType) {
		this.tarPartHandleType = tarPartHandleType;
	}


	public boolean isPartitionTable() {
		return partitionTable;
	}


	public void setPartitionTable(boolean partitionTable) {
		this.partitionTable = partitionTable;
	}
	

}
