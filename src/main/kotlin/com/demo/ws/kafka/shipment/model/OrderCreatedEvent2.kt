package com.demo.ws.kafka.shipment.model

data class OrderCreatedEvent2(
    val id: String,
    val productionId: String,
    val price: Double,
    val number: Int
)