package br.com.restassured.tests;

import br.com.restassured.data.Usuario;
import br.com.restassured.requests.UserRequests;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UsersTests {

    Response response;


    UserRequests userRequests = new UserRequests();

    @BeforeAll
    public void init(){
    }
    @Test
    public void getListUsersSuccess(){

        response = userRequests.getUsuarios();
        assertThat(response.statusCode(),equalTo(HttpStatus.SC_OK));

    }

    @Test
    public void postUsersSuccess(){
        Usuario usuario = new Usuario();
        response = userRequests.postUsuarios(usuario);
        assertThat(response.statusCode(),equalTo(HttpStatus.SC_CREATED));
        assertThat(response.getBody().jsonPath().get("message"),equalTo("Cadastro realizado com sucesso"));
    }
}
