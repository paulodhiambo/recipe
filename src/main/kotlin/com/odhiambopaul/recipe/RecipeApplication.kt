package com.odhiambopaul.recipe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecipeApplication

fun main(args: Array<String>) {
    runApplication<RecipeApplication>(*args)
}
