import org.junit.Assert.assertEquals
import org.junit.Test

class PointDegradationTest {

    @Test
    fun pencilCannotWritePastDegradation() {
        val pencil = Pencil(4)
        val paper = Paper()
        pencil.write("shesells", paper)
        assertEquals("shes    ", paper.getText())
    }


}