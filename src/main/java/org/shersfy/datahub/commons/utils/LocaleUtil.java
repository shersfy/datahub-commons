package org.shersfy.datahub.commons.utils;

import java.util.Locale;

import org.apache.commons.lang.LocaleUtils;

public class LocaleUtil{

	private LocaleUtil(){}
	
	/**
	 * 转换en_us
	 * 
	 * 
	 * @param str
	 * @return
	 */
	public static Locale toLocale(String str){
		if(str == null){
			return Locale.getDefault();
		}
		String lang = "_";
		String[] arr = str.split(lang);
		if(arr.length == 1){
			lang = arr[0];
		}
		else if(arr.length == 2){
			lang = arr[0]+lang+arr[1].toUpperCase();
		}
		else{
			lang = Locale.getDefault().getLanguage();
		}
		
		return LocaleUtils.toLocale(lang);
	}
	
}
