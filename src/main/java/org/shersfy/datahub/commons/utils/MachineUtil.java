package org.shersfy.datahub.commons.utils;

public class MachineUtil {

	public static String getMachineCode() {
		String machineCode = LocalHostUtil.MAC + "-" + LocalHostUtil.HOSTNAME + "-" + LocalHostUtil.IP;
		machineCode = MD5Util.encode(machineCode);
		return machineCode;
	}
}
