package com.github.albertosdlf.kmicronaut.service.mapper

import com.github.albertosdlf.kmicronaut.repository.model.PersonEntity
import org.bson.types.ObjectId
import org.mapstruct.Named

@Named("MappingUtils")
class MappingUtils {
    @Named("stringToObjectid")
    fun map(id: String): ObjectId {
        return ObjectId(id)
    }

    @Named("objectidToString")
    fun map(id: ObjectId): String {
        return id.toString()
    }
}