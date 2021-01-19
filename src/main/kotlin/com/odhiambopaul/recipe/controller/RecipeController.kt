package com.odhiambopaul.recipe.controller

import com.odhiambopaul.recipe.repository.CategoryRepository
import com.odhiambopaul.recipe.repository.UnitMeasureRepository
import org.springframework.stereotype.Controller

@Controller
class RecipeController(
    categoryRepository: CategoryRepository,
    unitMeasureRepository: UnitMeasureRepository
) {

}