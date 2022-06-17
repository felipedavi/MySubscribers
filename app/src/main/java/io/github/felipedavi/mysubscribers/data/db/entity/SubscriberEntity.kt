package io.github.felipedavi.mysubscribers.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Subscriber")
data class SubscriberEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val email: String
)