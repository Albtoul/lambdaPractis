

//Find one function (with no parameters) you have used in the past and rewrite it using a lambda expression
fun printAdvice(){
    println("you can do it")
}
val printAdvice = {
    println("you can do it")
}


//Find two functions that take in one or more parameters and rewrite them using a lambda expression
fun sum (a : Int , b: Int) : Int{
    return a +  b
}
val sum = { a: Int , b : Int -> Int
    a + b
}


/*
Find two functions that return a value and rewrite them using a lambda expression
Make sure to show the original function
*/
fun sequre(number : Int) : Int {
    return number * number
}
fun printName(name :String) : String{
    return name
}
val sequre = { number : Int -> Int
    number * number
}
val printName= { name : String -> String
    name
}

/*
Make use of a data class to create a Player class with attributes name, age, height (in cm)
Create a list of 20 players
Use a lambda expression to sort and print the list by each attribute*/

class Player(val name : String , val age : Int ,  val height : Int)
val player = listOf(
    Player("albtoul", 23, 160),
    Player("ameera", 23, 160),
    Player("amaal", 23, 160),
    Player("tahani", 23, 160),
    Player("ghada", 23, 160),
    Player("alreem", 23, 160),
    Player("mohammed", 23, 160),
    Player("sara", 23, 160),
    Player("ahad", 23, 160),
    Player("nora", 23, 160),
    Player("mneera", 23, 160),
    Player("hessa", 23, 160),
    Player("reham", 23, 160)
)
