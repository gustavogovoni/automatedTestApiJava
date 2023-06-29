package br.com.restassured.runner;

import br.com.restassured.tests.LoginTests;
import br.com.restassured.tests.UsersTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTests.class,
        UsersTests.class
})
public class AllTests {
}
