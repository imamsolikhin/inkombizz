package com.master.api.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Response {
	private boolean status;
	private String message;
	private Object data;
}
