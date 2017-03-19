package org.runnerisland.http

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given

@ContextConfiguration
// not mentioned by docs, but had to include this for Spock to startup the Spring context
@WebMvcTest(MyTaskRestController.class)
class MyTaskRestControllerTest extends Specification {

    @Autowired
    private MockMvc mvc


    def setup() {
        RestAssuredMockMvc.mockMvc(mvc)
    }

    def "listMyTasks"() {
        expect: "list my tasks with links"

        // @formatter:off
        given().
            log().everything().
        when().
            get("/rels/tasks/me").
        then().
            statusCode(200)
        // @formatter:on
    }
}
