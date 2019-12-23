import org.junit.Assert.assertEquals
import org.junit.Test

class PencilSharpeningTest {

    @Test
    fun sharpeningRestoresDurability() {
        val pencil = Pencil(4)
        val paper = Paper()
        pencil.write("Empty", paper)
        assertEquals("Emp  ", paper.getText())

        pencil.sharpen()

        pencil.write("durability", paper)
        assertEquals("Emp  dura      ", paper.getText())
    }


}