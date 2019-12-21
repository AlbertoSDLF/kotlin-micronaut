package com.github.albertosdlf.kmicronaut.controller.model

import io.micronaut.core.annotation.Introspected

@Introspected
data class PersonDto(
        var id: String?,
        var firstName: String?,
        var lastName: String?,
        var birthDate: String?
): ResponseBodyDto {
    constructor(): this(null, null, null, null)
}