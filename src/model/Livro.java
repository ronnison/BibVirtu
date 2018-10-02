/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author ronnison
 */
public class Livro {
    
    private int codigo;
    private String nome;
    private String autor;
    private int ano;
    private ImageIcon capa;
    private float nota;
    private String resenha;
    private Calendar cadastro;

    public Livro() {
    }

    public Livro(int codigo, String nome, String autor, int ano, ImageIcon capa, float nota, String resenha, Calendar cadastro) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.capa = capa;
        this.nota = nota;
        this.resenha = resenha;
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", ano=" + ano + ", nota=" + nota + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.autor);
        hash = 17 * hash + this.ano;
        hash = 17 * hash + Objects.hashCode(this.capa);
        hash = 17 * hash + Float.floatToIntBits(this.nota);
        hash = 17 * hash + Objects.hashCode(this.resenha);
        hash = 17 * hash + Objects.hashCode(this.cadastro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.capa, other.capa)) {
            return false;
        }
        if (Float.floatToIntBits(this.nota) != Float.floatToIntBits(other.nota)) {
            return false;
        }
        if (!Objects.equals(this.resenha, other.resenha)) {
            return false;
        }
        if (!Objects.equals(this.cadastro, other.cadastro)) {
            return false;
        }
        return true;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ImageIcon getCapa() {
        return capa;
    }

    public void setCapa(ImageIcon capa) {
        this.capa = capa;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getResenha() {
        return resenha;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public Calendar getCadastro() {
        return cadastro;
    }

    public void setCadastro(Calendar cadastro) {
        this.cadastro = cadastro;
    }
    
}
