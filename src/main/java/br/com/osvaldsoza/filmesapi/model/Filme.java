package br.com.osvaldsoza.filmesapi.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "filmes")
@Setter
@Getter
public class Filme {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    private String titulo;
    private String diretor;
    private int qtdCopias;
    private String genero;

}
