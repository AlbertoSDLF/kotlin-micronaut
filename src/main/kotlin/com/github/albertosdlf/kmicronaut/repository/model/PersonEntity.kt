package com.github.albertosdlf.kmicronaut.repository.model

import org.bson.types.ObjectId
import java.util.Date

data class PersonEntity(
        var id: ObjectId?,
        var firstName: String?,
        var lastName: String?,
        var birthDate: String?
) {
    constructor() : this(null, null, null, null)
}