package model;

public class Professor extends User {

    protected static Post post;
    private double media;

    public Professor(String nome, String matricula, String login, String senha, double media) {
        super(nome, matricula, login, senha);
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void interagir(String comentario)
    {
        Professor.post.Comentar("Professor: " + comentario);
    }
    
}
