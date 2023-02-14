class inserctr constructor(var name:String,var speed:Int,var color:String,var write:String,var haditation:String){
    fun character()
    {
        println("насекомое $name, имеет $color цвет, питаеться $write и обитает $haditation ")

    }
    fun spee() {
        when (speed) {
            in 1..3 -> println("медленная скорость $speed км.ч")
            in 4..7 -> println("средняя скорость $speed км.ч")
            in 8..12 -> println("быстрая скорость $speed км.ч")
            else -> println("не может быть такой скорости")

        }
    }
    fun popularity()
    {
        when
        {
            (name=="пауки"||name=="жужелицы"||name=="сверчки"||name=="муха"||name=="комар"||name=="моль")-> println("распространненые насекомое")
            else -> println("не распространненые насекомое")
        }

    }
}