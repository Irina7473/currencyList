import kotlinx.serialization.Serializable

@Serializable
class Currency (val ID: String, val NumCode: String, val CharCode: String,
                var Nominal: Int, val Name: String, var Value: Float, var Previous: Float){

    fun showCurrency() {
        println(NumCode+"\t"+CharCode+"\t"+Nominal+"\t"+Name+"\t"+Value)
    }

    fun convertRublesToCurrency (amount:Float) : Float {
        return amount / Nominal / Value
    }
}

@Serializable
class FileCBR (val Date: String, val PreviousDate: String, val PreviousURL: String,
                var Timestamp: String, val Valute: String){

}
