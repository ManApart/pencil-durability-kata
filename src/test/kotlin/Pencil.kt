import kotlin.math.min

class Pencil(private var durability: Int) {

    fun write(text: String, paper: Paper) {
        val writableLength = min(durability, text.length)
        durability -= writableLength
        val textToWrite = text.substring(0, writableLength).padEnd(text.length, ' ')
        paper.write(textToWrite)

    }
}