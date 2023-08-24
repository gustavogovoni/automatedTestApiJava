package br.com.restassured.data;

import com.github.javafaker.Faker;

public class Usuario {


    private String nome;
    private String email;
    private String password;
    private String administrador;

    public Usuario() {
        Faker faker =  new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String fullName = firstName+" "+lastName;
        String email = fullName.toLowerCase().replaceAll(" ","")+"@gmail.com";
        String password = faker.crypto().md5();
        this.nome = fullName;
        this.email = email;
        this.password = password;
        this.administrador = "true";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
}
