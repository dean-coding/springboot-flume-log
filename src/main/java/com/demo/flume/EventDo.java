package com.demo.flume;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventDo {
	private int key;

	private String value;
}