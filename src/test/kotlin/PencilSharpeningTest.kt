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

    @Test
    fun pencilsCannotBeSharpenedIfTheyHave0Length() {
        val pencil = Pencil(4, 0)
        val paper = Paper()
        pencil.write("Empty", paper)
        assertEquals("Emp  ", paper.getText())

        pencil.sharpen()

        pencil.write("durability", paper)
        assertEquals("Emp            ", paper.getText())
    }

    @Test
    fun sharpeningDecreasesLength() {
        val pencil = Pencil(4, 1)
        val paper = Paper()

        pencil.write("word", paper)
        pencil.sharpen()
        pencil.write("next", paper)
        pencil.sharpen()
        pencil.write("nope", paper)

        assertEquals("wordnext    ", paper.getText())
    }


}