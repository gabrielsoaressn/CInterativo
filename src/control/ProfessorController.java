package control;

import model.Aluno;
import model.Professor;
import view.ProfForm;

public class ProfessorController{

    private Professor model;
    private ProfForm view;

    public ProfessorController(Professor model, ProfForm view){
        this.model = model;
        this.view = view;
    }

    public String getProfLogin(){
        return model.getLogin();
    }

    public String getProfSenha(){
        return model.getPassword();
    }

    public String getProfMatricula(){
        return model.getMatricula();
    }

    public double getMedia(){
        return model.getMedia();
    }

    public void setProfMatricula(String matricula){
        model.setMatricula(matricula);
    }

    public void setProfLogin(String login){
        model.setLogin(login);
    }

    public void setProfSenha(String senha){
        model.setSenha(senha);
    }

    public void setMedia(double media){
        model.setMedia(media);
    }

    public void professorInteragir(String comentario){
        model.interagir(comentario);
    }

    public void updateView(){
    }

}
