package com.demo.ws.kafka.shipment.listener

import com.demo.wskafkaorder.events.model.Notification
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class NotificationListener {

    @KafkaListener(
        topics = [Notification.TOPIC],
        containerFactory = "notificationListenerContainerFactory"
    )
    fun listenToNotification(notification: Notification) {
        println(notification)
    }
}