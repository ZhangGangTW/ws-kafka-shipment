package com.demo.ws.kafka.shipment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@SpringBootApplication
class WsKafkaShipmentApplication

fun main(args: Array<String>) {
	runApplication<WsKafkaShipmentApplication>(*args)
}
