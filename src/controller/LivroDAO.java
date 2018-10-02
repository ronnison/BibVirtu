/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.Livro;

/**
 *
 * @author ronnison
 */
public class LivroDAO {
    
    private Connection con;
	
	public LivroDAO (){
		this.con = new ConnectionFactory().getConnection();
	}
	
	public void adiciona (Livro livro) {
		
		String sql = "insert into livro(nome, autor, capa, ano, nota, resenha, data_cadastro)"
				+ " values (?, ?, ?,?, ?, ?, ?)";
		
		try {
			
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, livro.getNome());
			stm.setString(2, livro.getAutor());
			stm.setInt(3, livro.getCapa());
			stm.setDate(4, (Date)livro.getAno());
                        stm.setFloat(5, livro.getNota());
                        stm.setString(6, livro.getResenha());
                        stm.setDate(7, (Date)livro.getCadastro());
			
			stm.execute();
			stm.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Livro> pesquisa () {
		
		List<Livro> lista = new ArrayList<Livro>();
		
		try {

			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stm = con.prepareStatement("select * from livro");
			ResultSet rs = stm.executeQuery();
			
			while (rs.next()) {
				
				Livro c = new Livro();
				c.setAutor(rs.getString("autor"));
                                c.setNome(rs.getString("nome"));
				c.setAno(rs.getDate("ano"));
                                c.setNota(rs.getFloat("nota"));
				
				lista.add(c);
				
			}
			
			rs.close();
			stm.close();
			con.close();
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
			
		}
		
		return lista;
		
	}
	
	public void altera (Livro c) {
		String sql = "update contatos set nome=?, email=?, "
				+ "endereco=?, dataNascimento=? where id=?";
		try {
			
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, c.getNome());
//			stm.setString(2, c.getEmail());
//			stm.setString(3, c.getEndereco());
//			stm.setDate(4, new Date(c.getDataNascimento().getTimeInMillis()));
//			stm.setLong(5, c.getId());
			stm.execute();
			stm.close();
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove (Livro c) {
		try {
			
			PreparedStatement stm = con.prepareStatement("delete from contatos where id=?");
//			stm.setLong(1, c.getId());
			stm.execute();
			stm.close();
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
    
}
