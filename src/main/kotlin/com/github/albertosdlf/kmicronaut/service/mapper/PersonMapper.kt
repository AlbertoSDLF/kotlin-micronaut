package com.github.albertosdlf.kmicronaut.service.mapper

import com.github.albertosdlf.kmicronaut.controller.model.PersonDto
import com.github.albertosdlf.kmicronaut.repository.model.PersonEntity
import com.github.albertosdlf.kmicronaut.service.model.Person
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(uses = [MappingUtils::class])
interface PersonMapper {
    fun convertToDto(person: Person): PersonDto

    fun convertFromDto(personDto: PersonDto): Person

    @Mapping(source = "id", target = "id", qualifiedByName = ["MappingUtils, stringToObjectid"])
    fun convertToEntity(person: Person): PersonEntity

    @Mapping(source = "id", target = "id", qualifiedByName = ["MappingUtils, objectidToString"])
    fun convertFromEntity(personEntity: PersonEntity): Person
}