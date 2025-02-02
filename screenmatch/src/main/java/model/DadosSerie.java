package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)	
public record DadosSerie(@JsonAlias("Title") String titulo,
		@JsonAlias("totalSessons") Integer totalTemporadas,
		@JsonAlias("imdbRating") String avalicao) {
	
}