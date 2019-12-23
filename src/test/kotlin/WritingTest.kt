import org.junit.Assert.assertEquals
import org.junit.Test

class WritingTest {

    @Test
    fun writeHardCodedString() {
        val pencil = Pencil()
        val paper = Paper()
        pencil.write("She sells sea shells", paper)
        assertEquals("She sells sea shells", paper.getText())
    }

    @Test
    fun writeADifferentString() {
        val pencil = Pencil()
        val paper = Paper()
        pencil.write("She surely sells those surely sea shells", paper)
        assertEquals("She surely sells those surely sea shells", paper.getText())
    }

    @Test
    fun appendText() {
        val pencil = Pencil()
        val paper = Paper()
        pencil.write("She sells sea shells", paper)
        pencil.write(" by the sea shore", paper)
        assertEquals("She sells sea shells by the sea shore", paper.getText())
    }

}