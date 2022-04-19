package model;

public class Professor extends User {

    private int nota;
    
    public Professor(String nome, String matricula, String login, String senha, int nota) {
        super(nome, matricula, login, senha);
        this.setNota(nota);
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void interagir(String comentario)
    {
        //Vou criar uma classe Avaliação. Avaliação vai ter a nota do professor, 
        //os comentários dos alunos e os cometários do professor.
    }
    
}
