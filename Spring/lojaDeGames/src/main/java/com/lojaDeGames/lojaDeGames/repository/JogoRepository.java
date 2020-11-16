  
package com.lojaDeGames.lojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lojaDeGames.lojaDeGames.model.Jogo;

@Repository

public interface JogoRepository extends JpaRepository<Jogo, Long> {
	public List<Jogo> findAllByNomeContainingIgnoreCase (String nome);
}