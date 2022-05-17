package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query("SELECT obj FROM Movie obj WHERE "
			+ "(:genre IS NULL OR :genre = obj.genre)")
	Page<Movie> find(Genre genre, Pageable page);
	
	@Query("SELECT new com.devsuperior.movieflix.dto.ReviewDTO(obj) "
			+ "FROM Review obj WHERE obj.movie = :movieId")
	List<ReviewDTO> find(Movie movieId);
	
}
