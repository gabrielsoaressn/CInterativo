package model;

public class UserFactory
{
    //0 aluno
    //1 prof
    //2 gestor
    public UserFactory(User user) {
        this.user = user;
    }
    public UserFactory() {}
    protected User user;

    public User factory(int sel, String nome, String matricula, String login, String senha){

        if (sel == 0)    
            return new Aluno(nome, matricula, login, senha);
        if(sel == 1)
            return new Professor(nome, matricula, login, senha, 10);
        if(sel == 2)
            return new Gestor(nome, matricula, login, senha);

        return new User(nome, matricula, login, senha);
    }


}