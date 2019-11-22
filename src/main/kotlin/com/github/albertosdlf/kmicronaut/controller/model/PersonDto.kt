package com.github.albertosdlf.kmicronaut.controller.model

import io.micronaut.core.annotation.Introspected
import java.util.Date

@Introspected
data class PersonDto(
        var id: String?,
        var firstName: String?,
        var lastName: String?,
        var birthDate: String?
) {
    constructor() : this(null, null, null, null)
}