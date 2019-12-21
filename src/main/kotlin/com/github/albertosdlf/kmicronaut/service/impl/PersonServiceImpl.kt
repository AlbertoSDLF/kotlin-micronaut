package com.github.albertosdlf.kmicronaut.service.impl

import com.github.albertosdlf.kmicronaut.repository.PersonRepository
import com.github.albertosdlf.kmicronaut.service.PersonService
import com.github.albertosdlf.kmicronaut.service.mapper.PersonMapper
import com.github.albertosdlf.kmicronaut.service.model.Person
import io.reactivex.Maybe
import org.bson.types.ObjectId
import org.mapstruct.factory.Mappers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PersonServiceImpl: PersonService {
    @Inject
    private lateinit var personRepository: PersonRepository

    private var personMapper: PersonMapper = Mappers.getMapper(PersonMapper::class.java)

    override fun getPerson(id: String): Maybe<Person> {
        return this.personRepository.getOne(ObjectId(id)).map { personEntity -> personMapper.convertFromEntity(personEntity)}
    }
}