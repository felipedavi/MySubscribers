package io.github.felipedavi.mysubscribers.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import io.github.felipedavi.mysubscribers.data.db.entity.SubscriberEntity

@Dao
interface SubscriberDAO{
    @Insert
    suspend fun insert(subscriber: SubscriberEntity): Long

    @Query("SELECT * FROM Subscriber")
    fun getAll(): LiveData<List<SubscriberEntity>>

    @Update
    suspend fun update(subscriber: SubscriberEntity)

    @Query("DELETE FROM SUBSCRIBER")
    suspend fun deleteAll()

    @Query("DELETE FROM SUBSCRIBER WHERE id = :id")
    suspend fun delete(id: Long)

}