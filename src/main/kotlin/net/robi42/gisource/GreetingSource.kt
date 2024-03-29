package net.robi42.gisource

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Source
import org.springframework.integration.annotation.InboundChannelAdapter
import org.springframework.integration.annotation.Poller
import java.lang.System.currentTimeMillis
import java.time.Instant
import java.time.Instant.now

@EnableBinding(Source::class)
class GreetingSource {

    /** Publishes a greeting message event object every 2 seconds (default: every second). */
    @InboundChannelAdapter(Source.OUTPUT, poller = arrayOf(Poller(fixedDelay = "2000")))
    fun greet() = Greeting(text = "Hello world! The time is: ${currentTimeMillis()}")

}

data class Greeting(
        val text: String,
        val timestamp: Instant = now()
)
