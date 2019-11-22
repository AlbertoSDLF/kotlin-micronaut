package com.github.albertosdlf.kmicronaut.repository

import com.github.albertosdlf.kmicronaut.repository.model.PersonEntity
import com.mongodb.client.model.Filters
import com.mongodb.reactivestreams.client.MongoClient
import io.reactivex.Single
import org.bson.types.ObjectId
import javax.inject.Singleton

@Singleton
class PersonRepository {
    private var mongodbClient: MongoClient

    constructor(mongodbClient: MongoClient ) {
        this.mongodbClient = mongodbClient;
    }

    fun getOne(id: ObjectId): Single<PersonEntity> {
        return Single.fromPublisher(this.mongodbClient.getDatabase("micronaut").getCollection("person", PersonEntity::class.java).find(Filters.eq("_id", id)))
    }
}