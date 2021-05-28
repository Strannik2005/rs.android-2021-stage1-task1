package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var i = 0

        var msg: String
        var howMuchWePayed = 0
        var howMuchIPayed = 0
        while (i < bill.size ){
            howMuchWePayed += bill[i]
            i++
        }
        howMuchWePayed = howMuchWePayed - bill[k]
        howMuchIPayed = howMuchWePayed / 2
        if(howMuchIPayed == b){
            msg = "bon appetit"

        }else{
            val temp = b - howMuchIPayed
            msg = temp.toString()
        }
        return msg
    }
}
