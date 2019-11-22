package com.github.albertosdlf.kmicronaut

import io.micronaut.runtime.Micronaut

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.github.albertosdlf.kmicronaut")
                .mainClass(Application.javaClass)
                .start()
    }
}