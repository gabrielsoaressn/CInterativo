package model;

public class User {
    protected String nome;
    protected String matricula;
    protected String login;
    protected String senha;

    public User(String nome, String matricula, String login, String senha) {
        this.nome = nome;
        this.matricula =  matricula;
        this.login = login;
        this.senha = senha;        
    }
    
      /**
       * @return String return the login
       */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getLogin() {
        return login;
    }
      
      /**
       * @param login the login to set
       */
    public void setLogin(String login) {
        this.login = login;
    }
    
      /**
       * @return String return the password
       */
    public void setSenha(String senha) {
            this.senha = senha;
      }
    public String getPassword() {
        return senha;
    }
    //falta implementar
    public void verRanking() {
        System.out.println("Ranking");
    }
    //falta implementar
    public void verAvaliacao() {
        System.out.println("avaliacao");
    }
    
}
