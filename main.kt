fun main()
{
    //класс насекомые
    println("введите название насекомого")
    val name:String=readLine()!!.toString()
    println("введите скорость насекомого")
    val speed:Int=readLine()!!.toInt()
    println("введите цвет насекомого")
    val color:String=readLine()!!.toString()
    println("введите чем питаеться насекомого")
    val write:String=readLine()!!.toString()
    println("введите где обитает насекомого")
    val haditation:String=readLine()!!.toString()
    if(name==""||color==""||write==""||haditation=="") println("вы не ввели какуюто позицию")
    else
    {
        val nosekom:inserctr=inserctr(name,speed,color,write,haditation)
        nosekom.character()
        nosekom.spee()
        nosekom.popularity()
    }
    //класс автомобиль
    println("введите название автомобиля")
    val name2:String=readLine()!!.toString()
    println("введите мощность автомобиля")
    val power:Int=readLine()!!.toInt()
    println("введите стоимость автомобиля")
    val price:Int=readLine()!!.toInt()
    if(name2=="")println("вы не ввели какуюто позицию")
    else
    {
        val avtomibile:avto=avto(name2,power,price)
        avtomibile.character2()
        avtomibile.expensive()
        avtomibile.pompo()
    }
}