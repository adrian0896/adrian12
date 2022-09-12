fun main() {
    var nama: String = "Adrian"
    var alamat: String ="""
         Saya tinggal di bengkalis 
         kuliah di politeknik negeri bengkalis
         di prodi rekayasa perangkat lunak
     """.trimIndent()

    println(nama)
    println("tentang " + alamat)

    //deklarasi VAL =imutable VAR =mutable
    nama= "yan"
    println(nama)
}