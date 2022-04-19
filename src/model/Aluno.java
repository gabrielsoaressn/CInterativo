package model;

public class Aluno extends User{

    public Aluno(String nome, String matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }
    public void avaliar(Professor professor, int nota, String comentario)
    {
        //atribui nota e comentário ao professor
    }
    public void interagir(String comentario)
    {
        //adiciona comentario ao professor
    }
}
