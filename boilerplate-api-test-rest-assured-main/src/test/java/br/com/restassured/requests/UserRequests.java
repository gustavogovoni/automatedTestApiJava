package br.com.restassured.requests;

import br.com.restassured.data.Login;
import br.com.restassured.data.Usuario;
import br.com.restassured.setup.RequestSpecificationSetup;

import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class UserRequests {
    String endpoint = "/usuarios";
    RequestSpecificationSetup spec = new RequestSpecificationSetup();


    public Response getUsuarios(){
        return given()
                .spec(spec.setRequestSpecification())
                .when()
                .get(endpoint)
                .then().extract().response();
    }

    public Response postUsuarios(Usuario usuario){
        return given()
                .spec(spec.setRequestSpecification())
                .body(usuario)
                .when()
                .post(endpoint)
                .then().extract().response();
    }




}
