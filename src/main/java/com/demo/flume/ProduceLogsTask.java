package com.demo.flume;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ProduceLogsTask {

	private static final Logger log = LoggerFactory.getLogger("local");

	private static final ObjectMapper mapper = new ObjectMapper();

	private static int no = 1;

	@Scheduled(fixedRate = 10000)
	public void produce() {
		try {
			log.info(mapper.writeValueAsString(new EventDo(no, UUID.randomUUID().toString())));
			no++;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
}
