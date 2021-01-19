package com.odhiambopaul.recipe.domain

import java.math.BigDecimal
import javax.persistence.*

//we don't use cascade here because we dont want to delete a recipe whenever we delete an ingredient
@Entity
data class Ingredient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val description: String?,
    val amount: BigDecimal?,
    @ManyToOne
    val recipe: Recipe,
    @OneToOne(fetch = FetchType.EAGER)//Unidirectional to UnitMeasure //loaded every time
    var unitOfMeasure: UnitMeasure?
)
