class Pencil(private var durability: Int) {

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
        return when (character) {
            ' ' -> 0
            else -> 1
        }
    }

}