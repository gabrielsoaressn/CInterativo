package control;

import model.Gestor;
import view.GestorForm;

public class GestorController {

    private final Gestor model;
    private final GestorForm view;

    public GestorController(Gestor model, GestorForm view){
        this.model = model;
        this.view = view;
    }

    public String getGestorLogin(){
        return model.getLogin();
    }

    public String getGestorSenha(){
        return model.getPassword();
    }

    public String getGestorMatricula(){
        return model.getMatricula();
    }

    public void setGestorMatricula(String matricula){
        model.setMatricula(matricula);
    }

    public void setGestorLogin(String login){
        model.setLogin(login);
    }

    public void setGestorSenha(String senha){
        model.setSenha(senha);
    }


    public void updateView(){

    }

}
