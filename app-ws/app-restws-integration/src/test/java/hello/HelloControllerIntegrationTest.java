package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { hello.Application.class }, webEnvironment = RANDOM_PORT)
@AutoConfigureWebTestClient
public class HelloControllerIntegrationTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void testHelloAPI() throws Exception {
        this.webClient.get().uri("hello").exchange().expectStatus().isOk();
    }
}
