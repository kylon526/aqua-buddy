package com.example.mongotest.db

import com.example.mongotest.db.models.User
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

object MongoClientConnectionExample {

    private val globalRealmConfiguration = RealmConfiguration.create(
        schema = setOf(User::class)
    )

    val globalRealm: Realm = Realm.open(globalRealmConfiguration)
}