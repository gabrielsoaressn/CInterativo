/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nicks
 */
public class Usuario {
    private String matricula; 
    private String usuario;
    private String senha;

    
    public Usuario(String matricula, String usuario, String senha) {
        this.matricula = matricula;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(String matricula, String senha) {
        this.matricula = matricula;
        this.senha = senha;
    }
    
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
