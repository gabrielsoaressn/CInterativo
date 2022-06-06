/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nicks
 */
public class Menua {
    
    private String nomea;
    private String cadeira;
    private String nota;
    private String comentar;

    public Menua(String nomea, String cadeira, String nota, String comentar) {
        this.nomea = nomea;
        this.cadeira = cadeira;
        this.nota = nota;
        this.comentar = comentar;
    }

    public String getNomea() {
        return nomea;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getComentar() {
        return comentar;
    }

    public void setComentar(String comentar) {
        this.comentar = comentar;
    }
    
    
    
}
