package wonuk.practice.componentscanpractice.fruitHandler

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service
import wonuk.practice.componentscanpractice.myAnnotation.MyAnnotation

@Service
@MyAnnotation
class BananaHandler: FruitHandler {
    private val logger = KotlinLogging.logger {}
    override val type: Fruit
        get() = Fruit.BANANA

    override fun foo() {
        logger.info { "BananaHandler" }
    }
}