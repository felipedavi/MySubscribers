package io.github.felipedavi.mysubscribers.repository

import androidx.lifecycle.LiveData
import io.github.felipedavi.mysubscribers.data.db.dao.SubscriberDAO
import io.github.felipedavi.mysubscribers.data.db.entity.SubscriberEntity

class DatabaseDataSource(private val subscriberDAO: SubscriberDAO): SubscriberRepository {
    override suspend fun insertSubscriber(name: String, email: String): Long {
        val subscriber = SubscriberEntity(name = name, email = email)
        return subscriberDAO.insert(subscriber)
    }

    override suspend fun getAllSubscriber(): LiveData<List<SubscriberEntity>> {
        return subscriberDAO.getAll()
    }

    override suspend fun updateSubscriber(id: Long, name: String, email: String) {
        val subscriber = SubscriberEntity(id = id, name = name, email = email)
        subscriberDAO.update(subscriber)
    }

    override suspend fun deleteSubscriber(id: Long) {
        subscriberDAO.delete(id)
    }

    override suspend fun deleteALLSubscriber() {
        subscriberDAO.deleteAll()
    }
}