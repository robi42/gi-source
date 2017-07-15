package net.robi42.gisource

import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@ActiveProfiles("test")
@RunWith(SpringRunner::class)
@SpringBootTest class GiSourceApplicationTests {

	@Ignore("Requires running Redis/Kafka")
    @Test fun `context loads`() {}

}
