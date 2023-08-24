package br.com.restassured.tests;

import br.com.restassured.data.Login;
import br.com.restassured.requests.LoginRequests;
import br.com.restassured.setup.RequestSpecificationSetup;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class LoginTests {

    Response response;
    LoginRequests loginRequests = new LoginRequests();
    @Test
    public void postLoginSuccess(){
      response = loginRequests.postLogin("fulano@qa.com", "teste");
      assertThat(response.statusCode(),equalTo(200));
      assertThat(response.getBody().jsonPath().get("message"),equalTo("Login realizado com sucesso"));
    }
      @Test
    public void postLoginPasswordBlank(){
          response = loginRequests.postLogin("fulano@qa.com", "");
          assertThat(response.statusCode(),equalTo(400));
          assertThat(response.getBody().jsonPath().get("password"),equalTo("password não pode ficar em branco"));
    }





}
