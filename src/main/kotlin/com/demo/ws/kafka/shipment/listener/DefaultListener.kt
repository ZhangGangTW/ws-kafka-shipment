package com.demo.ws.kafka.shipment.listener

import com.demo.ws.kafka.shipment.model.OrderCreatedEvent2
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class DefaultListener(
    private val objectMapper: ObjectMapper
) {

    @KafkaListener(
        topics = ["OrderCreatedEvent"],
        containerFactory = "defaultListenerContainerFactory"
    )
    fun listenToNotification(json: String) {
        val event: OrderCreatedEvent2 = objectMapper.readValue(json)
        println(event)
    }
}