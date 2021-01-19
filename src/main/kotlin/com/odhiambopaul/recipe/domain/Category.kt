package com.odhiambopaul.recipe.domain

import javax.persistence.*

@Entity
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    @ManyToMany(mappedBy = "category")
    val recipe: Set<Recipe>
)
