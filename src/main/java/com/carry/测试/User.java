package com.carry.测试;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class User implements Serializable {
 
	@JsonProperty(value = "ID", access = JsonProperty.Access.READ_WRITE)
	private Integer id;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("pwd")
	private Integer passWord;
}