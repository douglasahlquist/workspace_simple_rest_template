package com.ahlquist.document.controller.test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
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
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


@ComponentScan({"com.ahlquist.document.config", "com.ahlquist.document.controller", "com.ahlquist.document.ex.services", 
	"com.ahlquist.document.services", "com.ahlquist.document.model", "com.ahlquist.document.repositories"})
@SpringBootTest(classes={
		com.ahlquist.document.app.SpringBootApp.class,
        com.ahlquist.document.config.AppConfig.class,
        com.ahlquist.document.config.JPAConfig.class,
        com.ahlquist.document.config.WebAppInitializer.class
},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Test
public class DocumentControllerHappyPathTests extends AbstractH2BaseTestNgTest implements IDcoumentControllerHappyPathTests
{



	public void test1() {
//		 ResponseEntity<String> response = restTemplate.getForEntity("/v1/account/MostLikelyInvalidId",
//	                String.class);
//	        System.out.println("testFindAccountByIdEmpty() HttpStatus: " + response.getStatusCode());
//	        assert (response.getStatusCode().equals(HttpStatus.NOT_FOUND));
	}


	@Override
	@Test(priority = 1)
	public void getValidDocument200() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Test(priority = 2)
	public void createDocument201() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Test(priority = 3)
	public void updateValidDocument204() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Test(priority = 4)
	public void deleteValidDocument204() {
		// TODO Auto-generated method stub
		
	}

}
