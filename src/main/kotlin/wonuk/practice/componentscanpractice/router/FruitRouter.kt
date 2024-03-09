package wonuk.practice.componentscanpractice.router

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.stereotype.Service
import wonuk.practice.componentscanpractice.fruitHandler.Fruit
import wonuk.practice.componentscanpractice.fruitHandler.FruitHandler
import wonuk.practice.componentscanpractice.myAnnotation.MyAnnotation

@Service
class FruitRouter(
    beanFactory: ConfigurableListableBeanFactory
) {
    private val logger = KotlinLogging.logger { }
    private val handlerMap: HashMap<Fruit, FruitHandler>

    init {
        val beansWithAnnotation = beanFactory.getBeansWithAnnotation(MyAnnotation::class.java)
        handlerMap = beansWithAnnotation
            .values
            .map { bean ->
                bean as FruitHandler
            }.associateBy { it.type }
                as HashMap<Fruit, FruitHandler>
    }

    fun processFruit(fruit: Fruit) {
        handlerMap[fruit]?.foo() ?: logger.error { "[FruitRouter] has no handler" }
    }

}