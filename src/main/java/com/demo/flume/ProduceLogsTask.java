package com.demo.flume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProduceLogsTask {

	private static final Logger log = LoggerFactory.getLogger("local");

	private static int no = 1;

	@Scheduled(fixedRate = 10000)
	public void produce() {
		log.info("pro-a-log-msg:" + no);
		no++;
	}
}
