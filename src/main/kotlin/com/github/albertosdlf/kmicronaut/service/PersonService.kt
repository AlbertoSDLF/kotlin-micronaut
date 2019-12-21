package com.github.albertosdlf.kmicronaut.service

import com.github.albertosdlf.kmicronaut.service.model.Person
import io.reactivex.Maybe

interface PersonService {
    fun getPerson(id: String): Maybe<Person>
}