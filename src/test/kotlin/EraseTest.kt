import org.junit.Assert.assertEquals
import org.junit.Test

class EraseTest {

    @Test
    fun eraseLastWord() {
        val pencil = Pencil(1000)
        val paper = Paper("How much wood would a woodchuck chuck if a woodchuck could chuck wood?")
        pencil.erase("chuck", paper)
        assertEquals("How much wood would a woodchuck chuck if a woodchuck could       wood?", paper.getText())
    }

}