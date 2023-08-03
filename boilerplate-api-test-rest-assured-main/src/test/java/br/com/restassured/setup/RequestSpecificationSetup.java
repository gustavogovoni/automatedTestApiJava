package br.com.restassured.setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static br.com.restassured.setup.HandleProperties.getProperties;

public class RequestSpecificationSetup {
    public static RequestSpecification requestSpecification;

    public static RequestSpecification setRequestSpecification(){

        return requestSpecification = new RequestSpecBuilder()
                .setBaseUri(getProperties("APP_URL"))
                .setContentType(ContentType.JSON)
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();


    }

}
