package com.github.albertosdlf.kmicronaut

import com.github.albertosdlf.kmicronaut.controller.model.PersonDto
import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
import kotlin.test.assertEquals

object PersonControllerSpec : Spek({
    describe("PersonController Suite") {
        var embeddedServer: EmbeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
        var client: HttpClient = HttpClient.create(embeddedServer.url)

        it("test /hello responds Hello World") {
            var request: HttpRequest<String> = HttpRequest.GET("/api/person/1")
            var response: PersonDto = client.toBlocking().retrieve(request, PersonDto::class.java)
            assertEquals(1, response.id)
        }

        afterGroup {
            client.close()
            embeddedServer.close()
        }
    }
})
