# Documentação Projeto Rest Assured com Java

## Estrutura do Projeto

```
[src]
    [br.com.restassured]
                        [data]
                        [requests]
                        [runner]
                        [setup]
                        [tests]
[resources]  
```
- **data:** Este pacote contém as classes responsáveis por criar os objetos utilizados nos testes.
  
  Exemplo:Classe Usuario.
```Java
    public class Usuario {


    private String nome;
    private String email;
    private String password;
    private String administrador;

    public Usuario() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String fullName = firstName + " " + lastName;
        String email = fullName.toLowerCase().replaceAll(" ", "") + "@gmail.com";
        String password = faker.crypto().md5();
        this.nome = fullName;
        this.email = email;
        this.password = password;
        this.administrador = "true";
    }
} 
```
Observação: Repare que o construtor da classe está utilizando a biblioteca Faker para a criação do usuário assim que for instanciado o novo objeto.

- resquests