package com.github.albertosdlf.kmicronaut.repository

import com.mongodb.reactivestreams.client.MongoClient
import io.micronaut.context.annotation.Value
import javax.inject.Inject

class GenericRepository<T> {
    @Inject
    private lateinit var mongodbClient: MongoClient

    @Value("\${mongodb.database}")
    private lateinit var database: String;

//    fun getOne(id: ObjectId): Maybe<T> {
//        return Maybe.fromSingle(Single.fromPublisher(this.mongodbClient.getDatabase(database).getCollection("person", T).find(Filters.eq("_id", id))))
//    }
}