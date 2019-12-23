class Paper(private var text: String = "") {

    fun write(text: String) {
        this.text += text
    }

    fun getText(): String {
        return text
    }

    fun replace(start: Int, newText: String) {
        val collisionText = getCollisionText(newText, start)
        text = text.substring(0, start) + collisionText + text.substring(start + collisionText.length)
    }

    private fun getCollisionText(newText: String, start: Int): String {
        val existingText = text.substring(start, start + newText.length)
        return newText.indices.map { i ->
            val newChar = newText[i]
            val oldChar = existingText[i]
            if (newChar == ' ' || oldChar == ' ' || newChar == oldChar) {
                newChar
            } else {
                '@'
            }
        }.joinToString("")
    }


}