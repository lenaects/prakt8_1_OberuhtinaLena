class avto constructor(var name2:String,var power:Int,var price:Int){
    fun character2()
    {
        println("автомобиль марки $name2, мошностью $power л.с,  и стоимостью $price руб")
    }
    fun expensive()
    {
        when(price)
        {
            in 500000..1000000->println("дешевый автомобиль")
            in 1000001..2000000->println("средний автомобиль")
            in 2000001..3000000->println("дорогой автомобиль")
            in 3000001..5000000->println("премиум автомобиль")
            else-> println("не прадаются машины по такой стоимости")
        }
    }
    fun pompo()
    {
        when(power)
        {
            in 50.. 500->println("не мошный двигатель")
            in 501..2000->println(" мошный двигатель")
            else->println("нет в наличие машин с таким двигателем")
        }
    }
}