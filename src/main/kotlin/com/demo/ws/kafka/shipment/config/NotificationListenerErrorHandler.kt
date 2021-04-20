package com.demo.ws.kafka.shipment.config

import org.springframework.kafka.listener.KafkaListenerErrorHandler
import org.springframework.kafka.listener.ListenerExecutionFailedException
import org.springframework.messaging.Message
import org.springframework.stereotype.Component

@Component
class NotificationListenerErrorHandler : KafkaListenerErrorHandler {
    override fun handleError(message: Message<*>, exception: ListenerExecutionFailedException): Any? {
        println(message)
        println(exception)
        return null
    }
}