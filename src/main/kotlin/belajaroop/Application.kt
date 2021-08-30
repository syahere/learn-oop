package belajaroop


fun main(args:Array<String>) {

    fun hitungKubus() {
        val Kubus=Kubus(8.0)
        val sisi = Kubus.getSisiKubus()
        println("Luas dan volume kubus yang memiliki sisi $sisi cm adalah ${Kubus.luas()} cm2 dan ${Kubus.volume()} cm3")

    }

    fun hitungBalok() {
        val Balok = Balok(5.0)
        val tinggi = Balok.getTinggiBalok()
        val panjang = Balok.getPanjangBalok()
        val lebar = Balok.getLebarBalok()
        println("Luas dan volume balok dengan panjang $panjang cm, tinggi $tinggi cm, dan lebar $lebar cm adalah ${Balok.luas()} dan ${Balok.volume()}")
    }
    hitungKubus()
}