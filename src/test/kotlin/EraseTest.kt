import org.junit.Assert.assertEquals
import org.junit.Test

class EraseTest {

    @Test
    fun eraseLastWord() {
        val pencil = Pencil(1000, eraserDurability = 1000)
        val paper = Paper("How much wood would a woodchuck chuck if a woodchuck could chuck wood?")
        pencil.erase("chuck", paper)
        assertEquals("How much wood would a woodchuck chuck if a woodchuck could       wood?", paper.getText())
        pencil.erase("chuck", paper)
        assertEquals("How much wood would a woodchuck chuck if a wood      could       wood?", paper.getText())
    }

    @Test
    fun eraserHasDurability() {
        val pencil = Pencil(1000, eraserDurability = 3)
        val paper = Paper("Buffalo Bill")
        pencil.erase("Bill", paper)
        assertEquals("Buffalo B   ", paper.getText())
    }

    @Test
    fun eraserDegradesAsItIsUsed() {
        val pencil = Pencil(1000, eraserDurability = 6)
        val paper = Paper("BuffaloBill")
        pencil.erase("Bill", paper)
        pencil.erase("Buffalo", paper)
        assertEquals("Buffa      ", paper.getText())
    }

    @Test
    fun eraserDoesNotDegradeWhenErasingWhiteSpace() {
        val pencil = Pencil(1000, eraserDurability = 5)
        val paper = Paper("Buffalo Bill\n")
        pencil.erase("Buffalo Bill\n", paper)
        assertEquals("Buffal      \n", paper.getText())
    }

}