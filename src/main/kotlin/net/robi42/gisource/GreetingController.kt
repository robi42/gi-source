package net.robi42.gisource

import org.springframework.http.HttpStatus.ACCEPTED
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.support.GenericMessage
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.net.URLDecoder.decode
import java.nio.charset.StandardCharsets.UTF_8

@RestController class GreetingController(private val output: MessageChannel) {

    @PostMapping
    @ResponseStatus(ACCEPTED)
    fun sendMessage(@RequestBody text: String) {
        val greeting = Greeting(text = decode(text))

        output.send(GenericMessage(greeting))
    }

    private fun decode(text: String): String
            = decode(text, UTF_8.name())
            .replace(Regex("=$"), "")

}
