class Paper(private var text: String = "") {

    fun write(text: String) {
        this.text += text
    }

    fun getText(): String {
        return text
    }

    fun replace(start: Int, newText: String) {
        text = text.substring(0, start) + newText + text.substring(start + newText.length)
    }


}