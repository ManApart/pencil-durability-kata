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

    @Test
    fun durabilityDegradesWithUse() {
        val pencil = Pencil(4)
        val paper = Paper()
        pencil.write("she", paper)
        pencil.write("sells", paper)
        assertEquals("shes    ", paper.getText())
    }

    @Test
    fun spacesDoNotEffectDurability() {
        val pencil = Pencil(4)
        val paper = Paper()
        pencil.write("she sells", paper)
        assertEquals("she s    ", paper.getText())
    }

}