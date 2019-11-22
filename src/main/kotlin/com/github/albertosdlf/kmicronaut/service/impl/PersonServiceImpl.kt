package com.github.albertosdlf.kmicronaut.service.impl

import com.github.albertosdlf.kmicronaut.repository.PersonRepository
import com.github.albertosdlf.kmicronaut.repository.model.PersonEntity
import com.github.albertosdlf.kmicronaut.service.PersonService
import com.github.albertosdlf.kmicronaut.service.model.Person
import com.github.albertosdlf.kmicronaut.util.PersonMapper
import io.reactivex.Single
import org.bson.types.ObjectId
import org.mapstruct.factory.Mappers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PersonServiceImpl: PersonService {
    @Inject
    private lateinit var personRepository: PersonRepository

    private var personMapper: PersonMapper = Mappers.getMapper(PersonMapper::class.java)

    override fun getPerson(id: String): Person {
        var personEntity: PersonEntity = this.personRepository.getOne(ObjectId(id)).blockingGet()
        return personMapper.convertFromEntity(personEntity)
//        return this.personRepository.getOne(ObjectId(id)).map { personEntity -> personMapper.convertFromEntity(personEntity)}
    }
}