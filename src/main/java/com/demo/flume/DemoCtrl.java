package com.demo.flume;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/datas")
public class DemoCtrl {

	private static final Logger log = LoggerFactory.getLogger("local");

	private static final ObjectMapper mapper = new ObjectMapper();

	private static int no = 10000;

	@GetMapping
	public void produce() {

		try {
			for (int i = 0; i < 10000; i++) {
				log.info(mapper.writeValueAsString(new EventDo(no, UUID.randomUUID().toString())));
				no++;
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
