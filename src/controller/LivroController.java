/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Livro;

/**
 *
 * @author ronnison
 */
public class LivroController {
    
    LivroDAO ldao = new LivroDAO();
    
    public void cadastrarLivro (Livro livro) {
        ldao.adiciona(livro);
    }
    
    public void atualizarLivro(Livro livro) {
        ldao.altera(livro);
    }
    
    public void deletarLivro (Livro livro) {
        ldao.remove(livro);
    }
    
    public List<Livro> pesquisarLivro () {
        return ldao.pesquisa();
    }
    
}
