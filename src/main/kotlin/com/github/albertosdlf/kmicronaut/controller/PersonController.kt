package com.github.albertosdlf.kmicronaut.controller

import com.github.albertosdlf.kmicronaut.controller.model.ErrorDto
import com.github.albertosdlf.kmicronaut.controller.model.ResponseBodyDto
import com.github.albertosdlf.kmicronaut.service.PersonService
import com.github.albertosdlf.kmicronaut.service.mapper.PersonMapper
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.reactivex.Maybe
import org.mapstruct.factory.Mappers
import javax.inject.Inject

@Controller("/api/person")
@Produces(MediaType.APPLICATION_JSON)
class PersonController {
    @Inject
    lateinit var personService: PersonService

    private var personMapper: PersonMapper = Mappers.getMapper(PersonMapper::class.java)

    @Get("/{id}")
    fun getPerson(id: String): Maybe<ResponseBodyDto> {
        return try {
            this.personService.getPerson(id).map { person -> this.personMapper.convertToDto(person) }
        } catch (e: Throwable) {
            Maybe.just(ErrorDto("TEST"))
        }
    }
}