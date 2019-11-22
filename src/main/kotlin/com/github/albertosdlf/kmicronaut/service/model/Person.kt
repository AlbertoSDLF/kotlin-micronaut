package com.github.albertosdlf.kmicronaut.service.model

import java.util.Date

data class Person(
        var id: String?,
        var firstName: String?,
        var lastName: String?,
        var birthDate: String?
) {
    constructor() : this(null, null, null, null)
}