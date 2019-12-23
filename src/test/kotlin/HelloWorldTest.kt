import org.junit.Assert.assertEquals
import org.junit.Test

class HelloWorldTest {

    @Test
    fun testingWorks() {
        assertEquals(4, HelloWorld().addNumbers(2, 2))
    }

}