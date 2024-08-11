

import kotlin.comparisons.naturalOrder


fun generateLowercaseLetter() : Char {
    return ('a'..'z').random()
}

fun generateUppercaseLetter() : Char {
    return ('A'..'Z').random()
}


fun generateNumber() : Char {
    return ('0'..'9').random()
}

fun generateSpecialCharacter() : Char {
    return (':'..'@').random()
}


fun genPassowrd(n : Int) : String{
    var password  : String = ""


    for (i in 0..n){
        val choice : Int = (0..3).random()
        val character = when(choice){


            0 -> generateLowercaseLetter()
            1 -> generateSpecialCharacter()
            2 -> generateNumber()
            3 -> generateUppercaseLetter()
            else -> null
        }
        password += character
    
    }



    return password;
}


fun main(){
    println(genPassowrd(100))
}