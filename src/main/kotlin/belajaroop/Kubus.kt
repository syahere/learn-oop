package belajaroop

open class Kubus {
    var sisi:Double = 0.0

    constructor(sisi:Double){
        this.sisi = sisi
    }
    open fun volume():Double {
        return sisi*sisi*sisi

    }
    open fun luas():Double {
        return sisi*sisi * 6
    }

    fun getSisiKubus()=sisi
}


