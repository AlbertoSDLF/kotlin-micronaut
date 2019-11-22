package com.github.albertosdlf.kmicronaut.util

import com.github.albertosdlf.kmicronaut.controller.model.PersonDto
import com.github.albertosdlf.kmicronaut.repository.model.PersonEntity
import com.github.albertosdlf.kmicronaut.service.model.Person
import org.bson.types.ObjectId
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Named

@Mapper
interface PersonMapper {
    fun convertToDto(person: Person): PersonDto

    fun convertFromDto(personDto: PersonDto): Person

    @Mapping(source = "id", target = "id", qualifiedByName = [ "stringToObjectid" ])
    fun convertToEntity(person: Person): PersonEntity

    @Mapping(source = "id", target = "id", qualifiedByName = [ "objectidToString" ])
    fun convertFromEntity(personEntity: PersonEntity): Person

    @Named("stringToObjectid")
    fun map(id: String): ObjectId {
        return ObjectId(id)
    }

    @Named("objectidToString")
    fun map(id: ObjectId): String {
        return id.toString()
    }
}