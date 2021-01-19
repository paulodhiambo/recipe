package com.odhiambopaul.recipe.domain

import javax.persistence.*

@Entity
data class Notes(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @OneToOne
    var recipe: Recipe?,

    @Lob //Allows for more than 256 characters in the notes field as hibernate always limits the String field to 256 characters.
    var notes: String?
)
