package wonuk.practice.componentscanpractice

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import wonuk.practice.componentscanpractice.fruitHandler.Fruit
import wonuk.practice.componentscanpractice.router.FruitRouter

@SpringBootTest
class ComponentScanPracticeApplicationTests{
    // MyService 의존성 주입
    @Autowired
    private lateinit var router: FruitRouter
    @Test
    fun contextLoads() {
    }

    @Test
    fun testFruitRouter(){
        router.processFruit(Fruit.APPLE)
        router.processFruit(Fruit.BANANA)
    }
}
