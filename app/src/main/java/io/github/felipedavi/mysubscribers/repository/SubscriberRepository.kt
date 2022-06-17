package io.github.felipedavi.mysubscribers.repository

import androidx.lifecycle.LiveData
import io.github.felipedavi.mysubscribers.data.db.entity.SubscriberEntity

interface SubscriberRepository {
   suspend fun insertSubscriber(name: String, email: String): Long

   suspend fun getAllSubscriber(): LiveData<List<SubscriberEntity>>

   suspend fun updateSubscriber(id: Long, name: String, email: String)

   suspend fun deleteSubscriber(id: Long)

   suspend fun deleteALLSubscriber()

}