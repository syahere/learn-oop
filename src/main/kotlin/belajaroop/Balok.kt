package belajaroop

class Balok: BangunRuang {
    private var tinggi: Double = 0.0
    private var panjang: Double = 0.0
    private var lebar: Double = 0.0

    constructor(tinggi:Double){
        this.tinggi=tinggi
        this.panjang=2*tinggi
        this.lebar=tinggi/2
    }

    constructor(tinggi:Double, panjang:Double, lebar:Double){
        this.tinggi=tinggi
        this.panjang=panjang
        this.lebar=lebar
    }

    fun getTinggiBalok()=tinggi
    fun getPanjangBalok()=panjang
    fun getLebarBalok()=lebar

    override fun luas(): Double {
        return 2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (lebar * tinggi)
    }

    override fun volume(): Double {
        return panjang * lebar * tinggi
    }

}