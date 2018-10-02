/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.Date;
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
    private Date ano;
    private int capa;
    private float nota;
    private String resenha;
    private Date cadastro;

    public Livro() {
    }

    public Livro(int codigo, String nome, String autor, Date ano, int capa, float nota, String resenha, Date cadastro) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.capa = capa;
        this.ano = ano;
        this.nota = nota;
        this.resenha = resenha;
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", ano=" + ano + ", nota=" + nota + '}';
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.autor);
        hash = 47 * hash + Objects.hashCode(this.ano);
        hash = 47 * hash + this.capa;
        hash = 47 * hash + Float.floatToIntBits(this.nota);
        hash = 47 * hash + Objects.hashCode(this.resenha);
        hash = 47 * hash + Objects.hashCode(this.cadastro);
        return hash;
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

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getCapa() {
        return capa;
    }

    public void setCapa(int capa) {
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

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }
    
}
