package com.ahlquist.document.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.bind.annotation.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan({"com.ahlquist.document.config", "com.ahlquist.document.repositories",
	"com.ahlquist.document.services","com.ahlquist.document.ex.services"})
@TestPropertySource(locations="classpath:application.properties")
@SpringBootTest(classes={
		com.ahlquist.document.app.SpringBootApp.class,
        com.ahlquist.document.config.AppConfig.class,
        com.ahlquist.document.config.JPAConfig.class,
        com.ahlquist.document.config.WebAppInitializer.class
},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Test
public class AbstractH2BaseTestNgTest extends AbstractTestNgSpringContextTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

}
