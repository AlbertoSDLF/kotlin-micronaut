package com.github.albertosdlf.kmicronaut.controller

import com.github.albertosdlf.kmicronaut.controller.model.PersonDto
import com.github.albertosdlf.kmicronaut.service.PersonService
import com.github.albertosdlf.kmicronaut.service.model.Person
import com.github.albertosdlf.kmicronaut.util.PersonMapper
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.reactivex.Single
import org.mapstruct.factory.Mappers
import javax.inject.Inject

@Controller("/api/person")
@Produces(MediaType.APPLICATION_JSON)
class PersonController {
    @Inject
    lateinit var personService: PersonService

    private var personMapper: PersonMapper = Mappers.getMapper(PersonMapper::class.java)

    @Get("/{id}")
    fun getPerson(id: String): PersonDto {
        var person: Person = this.personService.getPerson(id);
        return this.personMapper.convertToDto(person)//.map { person -> this.personMapper.convertToDto(person) }
    }
}