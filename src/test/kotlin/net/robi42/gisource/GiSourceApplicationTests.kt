package net.robi42.gisource

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.stream.messaging.Source
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import javax.inject.Inject

@ActiveProfiles("test")
@RunWith(SpringRunner::class)
@SpringBootTest class GiSourceApplicationTests {

    @Suppress("SpringKotlinAutowiring")
    @Inject private lateinit var source: Source

    @Test fun `context loads`() {}

    @Test fun `wires up source output channel`() {
        assertThat(source.output()).isNotNull()
    }

}
