package br.com.restassured.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class UsersTests {
    @Test
    public void getListUsersSuccess(){
        String endpoint = "http://localhost:3000/usuarios";

        RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .log().all();
    }

}
