//if
//if else
//if else if
//when = switch case

fun main() {
    println("masukkan nilai uts")
    val UTS: Int = readLine()!!.toInt()
    println("masukkan nilai uas")
    val UAS: Int = readLine()!!.toInt()
    val NA: Double = (0.4 * UTS) + (0.6 * UAS)
    println(NA)

    if(NA > 80) {
        println("NAIK SEMESTER")
    } else {
        println("CUTI SEMETER")
    }
}
