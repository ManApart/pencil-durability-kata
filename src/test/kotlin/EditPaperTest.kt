import org.junit.Assert.assertEquals
import org.junit.Test

class EditPaperTest {

    @Test
    fun writeInWhitespace() {
        val pencil = Pencil(1000)
        val paper = Paper("An       a day keeps the doctor away")
        pencil.write("onion", 3, paper)
        assertEquals("An onion a day keeps the doctor away", paper.getText())
    }

    @Test
    fun writeOverCharacters() {
        val pencil = Pencil(1000)
        val paper = Paper("An       a day keeps the doctor away")
        pencil.write("artichoke", 3, paper)
        assertEquals("An artich@k@ay keeps the doctor away", paper.getText())
    }



}