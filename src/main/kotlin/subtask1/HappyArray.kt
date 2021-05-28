package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = sadArray.toMutableList();
        var i = 1
        var b = 1
        while (b < 5) {
            while (i < happyArray.size - 1) {
                if (happyArray[i - 1] + happyArray[i + 1] < happyArray[i]) {
                    happyArray.removeAt(i)

                } else {
                    i++
                }
            }
            i = 1
            b++
        }
    return happyArray.toIntArray()
    }
}
