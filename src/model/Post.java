package model;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Post {
    private List <Double> notas = Arrays.asList();
    private ArrayList <String> Comentarios = new ArrayList<String>();
    private double calcularMedia(List <Double> lista)
    {
        int soma = 0;
        for (Double n : notas)
        {
            soma += n.doubleValue();
        }
        return soma/notas.size();
    }

    double media = calcularMedia(notas);


    public void Comentar(String comentario)
    {
        Comentarios.add(comentario);
    }
    public void DarNota(double nota)
    {
        notas.add(nota);
    }
}
