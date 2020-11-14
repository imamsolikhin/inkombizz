package com.master.api.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

		private boolean status;
		private String message;
		private Object data;
}
