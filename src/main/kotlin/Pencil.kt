import kotlin.math.min

class Pencil(private val initialDurability: Int, private var length: Int = 1, private var eraserDurability: Int = 1) {
    private var durability = initialDurability

    fun sharpen() {
        if (length > 0) {
            length--
            durability = initialDurability
        }
    }

    fun write(text: String, paper: Paper) {
        val textToWrite = text.map { char ->
            if (durability > 0) {
                durability -= getCost(char)
                char
            } else {
                ' '
            }
        }.joinToString("")

        paper.write(textToWrite)
    }

    private fun getCost(character: Char): Int {
        return when {
            character == ' ' -> 0
            character == '\n' -> 0
            character.isUpperCase() -> 2
            else -> 1
        }
    }

    fun erase(text: String, paper: Paper) {
        val index = paper.getText().lastIndexOf(text)

        val newText = text.reversed().map { char ->
            when {
                char == '\n' -> char
                char == ' ' -> char
                eraserDurability > 0 -> {
                    eraserDurability--
                    ' '
                }
                else -> char

            }
        }.joinToString("").reversed()

        paper.replace(index, newText)
    }

}