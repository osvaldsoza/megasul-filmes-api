
  CREATE TABLE filmes
  (
    id serial primary key,
    titulo varchar(200) null,
    diretor varchar(200) null,
    qtd_copias bigint null,
    genero varchar(200) null
 );

  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('O Senhor do Anéis','Peter Jackson',14,'Fantasia');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('Vingadores:Ultimato','Anthony Russo e Joe Russo',10,'Fantasia');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('It: A Coisa','Andy Muschietti',5,'Terror');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('John Wick 3: Parabellum','Chad Stahelski',8,'Ação');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('Rambo: Até o Fim','Adrian Grunberg',6,'Ação');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('Velozes e Furiosos: Hobbs & Shaw','David Leitch',18,'Ação');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('Star Wars: A Guerra dos Clones','Chad Stahelski',28,'Fantasia');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('Pense como Eles','Tim Story',10,'Comédia');
  INSERT INTO filmes (titulo,diretor,qtd_copias,genero) VALUES ('The Perfect Match','Bille Woodruff',3,'Romance');


