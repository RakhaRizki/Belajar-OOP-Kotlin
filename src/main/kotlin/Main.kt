
class motor(){

    var merk: String? = null
    var cc: Int? = null
    var manual = true
    var color = "black"

    fun maju (){}
    fun mundur (){}
    fun rem (){}

}

fun main() {

    var ZX10R = motor()
    ZX10R.cc = 1000
    ZX10R.manual = true
    ZX10R.color = "black"
    ZX10R.merk = "Kawasaki"

    ZX10R.maju()
    ZX10R.mundur()
    ZX10R.rem()

    println(ZX10R.merk)

}



