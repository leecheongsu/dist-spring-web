package pharmcadd.hong

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): Map<String, Int> {
        return mapOf(
            "foo" to 1,
            "bar" to 2,
            "lcs" to 3,
            "abc" to 4
        )
    }
}

@SpringBootApplication
class App {

}

fun main(args: Array<String>) {
    runApplication<App>(*args)
}