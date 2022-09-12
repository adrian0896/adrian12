fun main() {
    print("masukan angka pertama")
    val angka1 = readLine()!!.toDouble()
    print("masukkan angka kedua")
    val angka2 = readLine()!!.toDouble()

    println("hasil pertambahan = ${angka1 + angka2}")
    println("hasil pengurangan = ${angka1 - angka2}")
    println("hasil perkalian   = ${angka1 * angka2}")
    println("hasil pembagian   = ${angka1 / angka2}")
}