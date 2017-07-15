package net.robi42.gisource

import java.time.Instant
import java.time.Instant.now

data class Greeting(
        val text: String,
        val timestamp: Instant = now()
)
