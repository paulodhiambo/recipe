package com.odhiambopaul.recipe.domain

import javax.persistence.*

@Entity
data class UnitMeasure(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val unitOfMeasure: String,
    @OneToOne
    val ingredient: Ingredient
)
