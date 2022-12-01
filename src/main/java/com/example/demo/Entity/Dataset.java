package com.example.demo.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.databind.util.EnumValues;

import co.elastic.clients.util.DateTime;

@Document(indexName = "test2")
public class Dataset {
	@Id
	private int id;
	private String Name;
	private String Description;
	private boolean Enable;
	private DateTime CreateTimeStamp;
	private DateTime UpdateTimeStamp;
	private List<String> Values;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public boolean isEnable() {
		return Enable;
	}
	public void setEnable(boolean enable) {
		Enable = enable;
	}
	public DateTime getCreateTimeStamp() {
		return CreateTimeStamp;
	}
	public void setCreateTimeStamp(DateTime createTimeStamp) {
		CreateTimeStamp = createTimeStamp;
	}
	public DateTime getUpdateTimeStamp() {
		return UpdateTimeStamp;
	}
	public void setUpdateTimeStamp(DateTime updateTimeStamp) {
		UpdateTimeStamp = updateTimeStamp;
	}
	public List<String> getValues() {
		return Values;
	}
	public void setValues(List<String> values) {
		Values = values;
	}
	@Override
	public String toString() {
		return "Dataset [id=" + id + ", Name=" + Name + ", Description=" + Description + ", Enable=" + Enable
				+ ", CreateTimeStamp=" + CreateTimeStamp + ", UpdateTimeStamp=" + UpdateTimeStamp + ", Values=" + Values
				+ "]";
	}
	
	
	

}
