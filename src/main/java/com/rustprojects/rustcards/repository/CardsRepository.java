package com.rustprojects.rustcards.repository;

import java.util.List;

import com.rustprojects.rustcards.model.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {

	
	List<Cards> findByCustomerId(int customerId);

}
