package br.com.osvaldsoza.filmesapi.service;

import br.com.osvaldsoza.filmesapi.model.Filme;
import br.com.osvaldsoza.filmesapi.model.Genero;
import br.com.osvaldsoza.filmesapi.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    @PersistenceContext
    private EntityManager manager;

    public List<Filme> filmes(){
        return repository.findAll(new Sort(Sort.Direction.DESC, "id"));
    }

    public List<Filme>qtdCopiasGroupByGenero(){
        return manager.createQuery("select sum(c.qtdCopias) as copias, c.genero from Filme c group by (c.genero) order by c.genero").getResultList();
    }

    public Filme novoFilme(Filme filme){
        return repository.save(filme);
    }

    public void deleteIdea(Long id) {
        Optional<Filme> findFilme = repository.findById(id);
        if (findFilme.isPresent()) {
            repository.deleteById(id);
        }
    }
}
