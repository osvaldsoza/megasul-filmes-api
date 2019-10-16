package br.com.osvaldsoza.filmesapi.repository;

import br.com.osvaldsoza.filmesapi.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
