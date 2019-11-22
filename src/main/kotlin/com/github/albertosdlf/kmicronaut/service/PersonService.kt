package com.github.albertosdlf.kmicronaut.service

import com.github.albertosdlf.kmicronaut.service.model.Person
import io.reactivex.Single

interface PersonService {
    fun getPerson(id: String): Person
}