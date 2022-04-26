package model;

public class Aluno extends User{

    public Aluno(String nome, String matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }
    public void avaliar(Professor professor, int nota, String comentario)
    {
        Professor.post.DarNota(nota);
        Professor.post.Comentar(comentario);

    }
    public void interagir(String comentario)
    {
        Professor.post.Comentar(comentario);
    }
}
