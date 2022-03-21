class book{
    var judul = ""
    var pengarang = ""
    var penerbit = ""
    var year = 0
}

fun main() {
    val c1 = book()
    c1.judul= "Bumi Manusia"
    c1.pengarang = "Pramoedya Ananta Toer"
    c1.penerbit ="Gramedia"
    c1.year = 1980

    val c2 = book()
    c2.judul= "laskar Pelangi"
    c2.pengarang = "Andrea Hirata"
    c2.penerbit ="Gramedia"
    c2.year = 2005

    
    println("\n"+"Judul: "+c1.judul)
    println("Pengarang: "+c1.pengarang)
    println("Penerbit: "+c1.penerbit)
    println("Tahun Produksi: "+c1.year+"\n")
    println("Judul: "+c2.judul)
    println("Pengarang: "+c2.pengarang)
    println("Penerbit: "+c2.penerbit)
    println("Tahun Produksi: "+c2.year)

}