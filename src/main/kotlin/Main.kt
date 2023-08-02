
// Contoh OOP Bagan 1

//class motor(){
//
//    var merk: String? = null
//    var cc: Int? = null
//    var manual = true
//    var color = "black"
//
//    fun maju (){}
//    fun mundur (){}
//    fun rem (){}
//
//}

// Selesai 1

// Contoh Secondary Constructor

//class Hewan (nama: String, berat: Float, berbulu: Boolean){
//    val nama: String
//    val berat: Float
//    val berbulu: Boolean
//    var umur: Int? = null
//
//    init {
//        this.nama = nama
//        this.berat = if (berat <= 0) 0.1f else berat
//        this.berbulu = berbulu
//    }
//
//    constructor(nama: String, berat: Float, berbulu: Boolean, umur: Int): this(nama,berat,berbulu){
//        this.umur = if (umur < 0) 0 else umur
//    }
//
//    fun info(){
//        println("nama: $nama \nBerat: $berat \nHewan Berbulu: $berbulu \nUmur: $umur tahun")
//    }
//}

// Selesai 2

// Contoh Interface

interface Ipet {
    fun main ()
    fun makan ()
    fun turu ()
}

class Cat : Ipet {
    override fun main() {
        println("Kucing sedang bermain")
    }

    override fun makan() {
        println("Kucing lagi mangan")
    }

    override fun turu() {
        println("Kucing lagi turu")
    }

}

// Selesai 3

// Contoh Visibility Protected

//open class Hewan (val nama: String, protected val berat: Float) {
//    fun info() {
//        println("Nama: $nama \nBerat: $berat \nHewan")
//    }
//
//}
//
//class dog (nama: String, berat: Float, val jenis: String, val asal: String): Hewan(nama, berat)

// Selesai 4

fun main() {

//    Contoh OOP Bagan 1

//    var ZX10R = motor()
//    ZX10R.cc = 1000
//    ZX10R.manual = true
//    ZX10R.color = "black"
//    ZX10R.merk = "Kawasaki"
//
//    ZX10R.maju()
//    ZX10R.mundur()
//    ZX10R.rem()

//    println(ZX10R.merk)

//    Selesai 1

//    Contoh Secondary Constructor

//    val kucing = Hewan("Tatsuya", 20.3f, true)
//    kucing.info()
//
//    val kambing = Hewan("Temon", 32.5f, true, 16)
//    kambing.info()

//    Selesai 2

//    Contoh Interface

        val hewan = Cat()
        hewan.main()
        hewan.makan()
        hewan.turu()

//    Selesai 3

//    Contoh Visibility Protected

//    val Slurp = dog("Rudi", 3.4f,"Mamalia","Malaysia")
//    println("Nama Anjing ${Slurp.nama}")
//    println("Berat Anjing ${Slurp.berat}")

//    Selesai 4

}



