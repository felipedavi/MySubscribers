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
        @Volatile
        private var INSTANCE: SubscriberDataBase? = null
        fun getInstance(context: Context): SubscriberDataBase {
            synchronized(this) {
                var instance: SubscriberDataBase? = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context,
                        SubscriberDataBase::class.java,
                        "app_database"
                    ).build()
                }
                return instance
            }
        }
    }
}