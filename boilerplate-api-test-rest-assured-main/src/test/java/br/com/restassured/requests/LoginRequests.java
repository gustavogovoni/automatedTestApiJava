package br.com.restassured.requests;

import br.com.restassured.data.Login;
import br.com.restassured.setup.RequestSpecificationSetup;

import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class LoginRequests {
    String endpoint = "/login";
    RequestSpecificationSetup spec = new RequestSpecificationSetup();


    public Response postLogin(String email, String password){
           return given()
                .spec(spec.setRequestSpecification())
                .body(new Login(email, password))
            .when()
                .post(endpoint)
            .then().extract().response();
    }

}
