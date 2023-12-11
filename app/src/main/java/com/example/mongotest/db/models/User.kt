package com.example.mongotest.db.models

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class User() : RealmObject {
    @PrimaryKey
    var _id: ObjectId = ObjectId()
    var theme_preference: String = ""

    constructor(themePreference: String = "") : this() {
        theme_preference = themePreference
    }
}