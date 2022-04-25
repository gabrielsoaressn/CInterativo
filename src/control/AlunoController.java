package control;

import model.Aluno;
import model.Professor;
import view.AlunoForm;

public class AlunoController {
    private Aluno model;
    private AlunoForm view;

    public AlunoController(Aluno model, AlunoForm view) {
        this.model = model;
        this.view = view;
    }

    public String getAlunoLogin() {
        return model.getLogin();
    }

    public String getAlunoSenha() {
        return model.getPassword();
    }

    public String getMatricula() {
        return model.getMatricula();
    }

    public void setAlunoMatricula(String matricula) {
        model.setMatricula(matricula);
    }

    public void setAlunoLogin(String login) {
        model.setLogin(login);
    }

    public void setAlunoSenha(String senha) {
        model.setSenha(senha);
    }

    public void avaliarProfessor(Professor professor, int nota, String comentario) {
        model.avaliar(professor, nota, comentario);
    }

    public void comentarProfessor(String comentario) {
        model.interagir(comentario);
    }

    public void atualizarView() {
    }
}
