package net.robi42.gisource

import org.springframework.cloud.stream.messaging.Source
import org.springframework.http.HttpStatus.ACCEPTED
import org.springframework.messaging.support.GenericMessage
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.net.URLDecoder.decode
import java.nio.charset.StandardCharsets.UTF_8

@RestController class GreetingController(private val source: Source) {

    @PostMapping
    @ResponseStatus(ACCEPTED)
    fun sendMessage(@RequestBody text: String) {
        val decodedText = decode(text, UTF_8.name())
        val greeting = Greeting(text = decodedText)

        source.output().send(GenericMessage(greeting))
    }

}
