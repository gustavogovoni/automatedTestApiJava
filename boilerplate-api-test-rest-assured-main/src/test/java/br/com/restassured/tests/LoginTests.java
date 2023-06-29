package br.com.restassured.tests;

import br.com.restassured.data.Login;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class LoginTests {
    @Test
    public void postLoginSuccess(){
        String endpoint = "http://localhost:3000/login";
        Login requestBody = new Login("fulano@qa.com", "teste");
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(endpoint)
                .then()
                .statusCode(200)
                .body("message",equalTo("Login realizado com sucesso"))
                .log().all();
    }
      @Test
    public void postLoginPasswordBlank(){
        String endpoint = "http://localhost:3000/login";
        Login requestBody = new Login("fulano@qa.com", "teste");
        requestBody.setPassword("");
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(endpoint)
                .then()
                .statusCode(400)
                .body("password",equalTo("password não pode ficar em branco"))
                .log().all();
    }





}
