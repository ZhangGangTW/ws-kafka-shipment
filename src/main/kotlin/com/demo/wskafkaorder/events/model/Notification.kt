package com.demo.wskafkaorder.events.model

import org.apache.kafka.common.serialization.Deserializer
import org.springframework.util.SerializationUtils
import java.io.Serializable
import java.time.Instant

data class Notification(
    val id: String,
    val from: String,
    val content: String,
    val createAt: Instant,
    val urgent: Boolean
) : Serializable {
    companion object {
        const val TOPIC = "notification"
    }
}

class NotificationDeserializer : Deserializer<Notification> {
    override fun deserialize(topic: String, data: ByteArray): Notification? {
        return try {
            SerializationUtils.deserialize(data) as Notification
        } catch (e: Exception) {
            null
        }
    }
}