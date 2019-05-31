package model;

import java.io.Serializable;

public class Livro implements Serializable{
	
    private static final long serialVersionUID = -1729250283123759057L;

    String titulo;
    String autor;
    String nota;

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
        
}
