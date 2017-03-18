package specs

import spock.lang.Ignore
import spock.lang.Specification

class RunnerSpecs extends Specification {

    @Ignore
    def "runner starts running"() {
        given: "I'm John"

        when: "I start running for task 1"


        then: "the equipment is ready to record running activity"

    }

    @Ignore
    def "runner fails to start running due to stage is locked"() {
        given: "I'm Michael"
        and: "I didn't finish stage 1"


        when: "I start running for task 4"


        then: "the equipment is ready to record running activity"
    }

}