package br.com.osvaldsoza.filmesapi.resource;

import br.com.osvaldsoza.filmesapi.model.Filme;
import br.com.osvaldsoza.filmesapi.model.Genero;
import br.com.osvaldsoza.filmesapi.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
@CrossOrigin(maxAge = 10, origins = {"*"})
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @GetMapping
    public List<Filme> filmes(){
        return service.filmes();
    }

    @GetMapping("/copias")
     public List<Filme> qtdCopiasGroupByGenero(){
        return service.qtdCopiasGroupByGenero();
     }

     @PostMapping
     public ResponseEntity<Filme> novoFilme(@RequestBody Filme filme){
        Filme novoFilme  = service.novoFilme(filme);
        return new ResponseEntity<>(novoFilme, HttpStatus.CREATED);
     }

     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deleteFilme(@PathVariable Long id){
           service.deleteIdea(id);
           return new ResponseEntity<>(HttpStatus.OK);
     }
}
