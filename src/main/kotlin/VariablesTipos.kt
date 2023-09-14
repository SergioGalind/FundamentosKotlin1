fun main(){
    //variables y tipos de datos kotlin
    //val para constantes
    // var para variables

    val name = "Mariel Báez"
    var age = 20

    print("Hola, soy " +name+ "y tengo ")
    println(""+age+" años")

    // name = "Mari" las viables val no cambian (inmutables)
    age = 28
    age = age + 15

    // age = "once" variables var que ccambian de valor (lo demas ya no lo veo)

    //Especificar tipo de dato en declaracion

    //Declaracion
    val city: String
    val cars = 2
    //inicializacion
    city ="Santa Maria Tocatlan"

    //Declaracion e inicializacion
    val isMarried: Boolean =false

    val children: Int = 1
    val height: Double=1.58

    // String templates
    //$ para imprimir valor de variables
    //${} para procesos antes de imprimir

    println( " hola soy $name y tengo $age años")
    println(" Vivo en $city, tengo $children hijos y  $cars  ")

    println("en 2030 tendre ${ children } hijos")
}