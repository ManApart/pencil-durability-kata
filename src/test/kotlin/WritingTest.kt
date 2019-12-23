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

}