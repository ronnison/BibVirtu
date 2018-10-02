create database bibvirtubd;

use bibvirtubd;

create table livros( 
cod_livro int auto_increment primary key, 
	nome varchar(80) not null,
	autor varchar(80) not null,
	capa int,
	ano date,
	nota real,
	resenha varchar(100),
	data_cadastro date);

insert into livros values (1, 'Me Polpe', 'Nathalia Arcuri', 1, '2018-10-01', 8.5, 'Livro sobre finanças', '2018-10-02');
insert into livros values (2, 'Produtividade para quem quer tempo', 'Gerônimo Thelm', 2, '2018-10-01', 8.0, 'Livro sobre Produtividade', '2018-10-02');
insert into livros values (3, 'Harry Potter e a Pedra Filosofal', 'J. k. Rolling', 3, '2018-10-01', 7.5, 'Livro sobre um menino bruxo', '2018-10-02');
insert into livros values (4, 'Harry Potter e a Câmara Secreta', 'J. k. Rolling', 4, '2018-10-01', 8.0, 'Livro sobre um menino bruxo e uma câmara secreta', '2018-10-02');
insert into livros values (5, 'Darkmouth: Caçadores de Lendas', 'Thomas André', 5, '2018-10-01', 9.0, 'Livro sobre um menino e monstros', '2018-10-02');
insert into livros values (6, 'O espadachim de Carvão', 'Affonso Solano', 6, '2018-10-01', 8.0, 'Livro sobre um guerreiro', '2018-10-02');
insert into livros values (7, 'Diário de um Banana', 'Jeff Kinney', 7, '2018-10-01', 7.5, 'Livro sobre um menino bruxo', '2018-10-02');
insert into livros values (8, 'Senhor dos Anéis', 'J. R. R. Tolkien', 8, '2018-10-01', 10.0, 'Livro sobre um menino bruxo e uma câmara secreta', '2018-10-02');
insert into livros values (9, 'O Poder da Espada', 'Joe Abercrombie', 9, '2018-10-01', 7.5, 'Livro sobre um menino bruxo', '2018-10-02');
insert into livros values (10, 'Prince Of Thorns', 'Mark Lawrence', 10, '2018-10-01', 8.0, 'Livro sobre um menino bruxo e uma câmara secreta', '2018-10-02');
