class Pencil(private val initialDurability: Int, private val length: Int = 1) {
    private var durability = initialDurability

    fun sharpen() {
        if (length > 0) {
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


}