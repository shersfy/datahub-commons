package org.shersfy.datahub.commons.utils;

import java.io.File;

/**
 */
public class FormField {

	private String name;
	private String value;
	private File file;
	private Long offset;
	private Long limit;
	private FormFieldType type;
	
	public static enum FormFieldType{
		File,
		Text,
		Password;
	}

	public FormField() {
		this.type = FormFieldType.Text;
	}

	public FormField(String name, String value) {
		this();
		this.name = name;
		this.value = value;
	}
	
	public FormField(FormFieldType type, String name, Object value) {
		this.name = name;
		if(type == null){
			type = FormFieldType.Text;
		}
		this.type = type;
		
		if(FormFieldType.File == type){
			if(value!=null){
				this.file  = (File) value;
				this.value = this.file.getPath();
				this.offset = 0L;
				this.limit  = file.length();
			}
		}
		else {
			this.value = value == null? "" : String.valueOf(value);
		}
	}

	public FormField(String name, File file, Long offset, Long limit) {
		this.type = FormFieldType.File;
		this.name = name;
		this.file = file;
		this.offset = offset;
		this.limit = limit;
	}

	public FormFieldType getType() {
		return type;
	}

	public void setType(FormFieldType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Long getOffset() {
		return offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

}
