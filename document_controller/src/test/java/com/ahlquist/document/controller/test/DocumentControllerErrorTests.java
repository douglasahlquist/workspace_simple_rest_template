package com.ahlquist.document.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


public class DocumentControllerErrorTests extends AbstractH2BaseTestNgTest implements IDcoumentControllerErrorTests
{

	public static final String ROOT_URL = "/storage/documents/";
	
	@Autowired
	private TestRestTemplate restTemplate;


	@Test(priority = 1)
	@Override
	public void createWithNoBody403() {
//		 ResponseEntity<String> response = restTemplate.getForEntity("/document/storage",
//        String.class);
//System.out.println("testFindAccountByIdEmpty() HttpStatus: " + response.getStatusCode());
//assert (response.getStatusCode().equals(HttpStatus.NOT_FOUND));

		
	}

	@Test(priority = 2)
	@Override
	public void getInvalidDocument404() {
		
//		 ResponseEntity<String> response = restTemplate.getForEntity("/document/storage",
//      String.class);
//System.out.println("testFindAccountByIdEmpty() HttpStatus: " + response.getStatusCode());
//assert (response.getStatusCode().equals(HttpStatus.NOT_FOUND));
	}



	@Test(priority = 3)
	@Override
	public void updateInvalidDcoment404() {
		
//		 ResponseEntity<String> response = restTemplate.getForEntity("/document/storage",
//      String.class);
//System.out.println("testFindAccountByIdEmpty() HttpStatus: " + response.getStatusCode());
//assert (response.getStatusCode().equals(HttpStatus.NOT_FOUND));
	}

	@Test(priority = 4)
	@Override
	public void deleteInvalidDocument404() {
//		 ResponseEntity<String> response = restTemplate.getForEntity("/document/storage",
//      String.class);
//System.out.println("testFindAccountByIdEmpty() HttpStatus: " + response.getStatusCode());
//assert (response.getStatusCode().equals(HttpStatus.NOT_FOUND));
		
	}

}
