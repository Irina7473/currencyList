import com.fasterxml.jackson.module.kotlin.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File


fun main() {
    /*
    val euro = Currency ( "R01239","978","EUR",1,"Евро", 86.2826F, 86.2956F)
    euro.showCurrency()
    println("Введите сумму в рублях для конвертации в евро")
    var amount : Float
    var imput = readLine()
    try {
        amount = euro.convertRublesToCurrency(imput!!.toFloat())
        println("Введенная сумма в рублях равна $amount евро")
    }
    catch (e: Exception) {
        println("Сумма не введена")
    }

    val json = Json.encodeToString(euro)
    println(json)
    val tenge: Currency = Json.decodeFromString<Currency>("""{"ID": "R01335", "NumCode": "398", "CharCode": "KZT", "Nominal": 100, "Name": "Казахстанских тенге", "Value": 17.6253, "Previous": 17.5852}""")
    tenge.showCurrency()
    var currencyList: MutableList<Currency> = mutableListOf(euro)
    currencyList.add(tenge)
    for (c in currencyList) c.showCurrency()
*/

    val path ="daily_json.js"
    val jsonContent =  File(path).readLines().toString()
    println(jsonContent)

    val listCBR: FileCBR = Json.decodeFromString<FileCBR> (jsonContent)
    println(listCBR)


    //val mapper = jacksonObjectMapper()
    //val listCBR : FileCBR = mapper.readValue(jsonContent)
    //val currencyList2: List<Currency> = mapper.readValue(jsonContent)
    //for (c in currencyList2) c.showCurrency()



}