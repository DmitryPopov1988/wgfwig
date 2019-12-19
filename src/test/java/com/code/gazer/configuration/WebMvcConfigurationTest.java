package com.code.gazer.configuration;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;

@Execution(ExecutionMode.CONCURRENT)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class WebMvcConfigurationTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void restEndpointTest() {
    var response = restTemplate.getForEntity("/", String.class);
    assertThat(response.getBody(), containsString("Codegazer"));
    assertThat(response.getStatusCode(), is(HttpStatus.OK));
  }

}