package com.pasta.security.business;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RecipeRepository extends CrudRepository<Recipe, Long> {

}
