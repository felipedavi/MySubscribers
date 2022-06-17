package io.github.felipedavi.mysubscribers.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.github.felipedavi.mysubscribers.data.db.dao.SubscriberDAO
import io.github.felipedavi.mysubscribers.data.db.entity.SubscriberEntity

@Database(entities = [SubscriberEntity::class], version = 1)
abstract class SubscriberDataBase: RoomDatabase() {
    abstract fun subscriberDAO(): SubscriberDAO

    companion object {
        private lateinit var INSTANCE: SubscriberDataBase
        fun getDatabase(context:Context): SubscriberDataBase {
            if (!::INSTANCE.isInitialized) {
                synchronized(SubscriberDataBase::class) {
                    INSTANCE = Room.databaseBuilder(context, SubscriberDataBase::class.java, "app_database")
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}