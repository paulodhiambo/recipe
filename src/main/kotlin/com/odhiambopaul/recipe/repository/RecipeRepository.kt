package com.odhiambopaul.recipe.repository

import com.odhiambopaul.recipe.domain.Recipe
import org.springframework.data.repository.CrudRepository

interface RecipeRepository : CrudRepository<Recipe, Long> {
}