package com.github.albertosdlf.kmicronaut.repository

import com.github.albertosdlf.kmicronaut.repository.model.PersonEntity
import com.mongodb.client.model.Filters
import com.mongodb.reactivestreams.client.MongoClient
import io.reactivex.Maybe
import io.reactivex.Single
import org.bson.types.ObjectId
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PersonRepository {
    @Inject
    private lateinit var mongodbClient: MongoClient

    fun getOne(id: ObjectId): Maybe<PersonEntity> {
        return Single.fromPublisher(this.mongodbClient.getDatabase("micronaut").getCollection("person", PersonEntity::class.java).find(Filters.eq("_id", id))).toMaybe()
    }
}