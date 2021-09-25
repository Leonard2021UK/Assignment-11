package com.codercampus.Assignment11;

import com.codercampus.Assignment11.contoller.TransactionController;
import com.codercampus.Assignment11.service.TransactionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ApplicationContextTest {

	@Autowired
	public TransactionController transactionController;

	@Autowired
	TransactionService transactionService;

	@Test
	public void contextLoads() throws Exception {
		assertThat(transactionController).isNotNull();
		assertThat(transactionService).isNotNull();

	}
}
