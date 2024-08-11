/*

Напишите алгоритм сжатия заданной строки путем замены последовательностей одинаковых символов одним символом и числом, определяющим
количество его повторений. Например, строку аааЬЬЬЬЬсс следует сжать
в а3Ь4с2. 



*/



fun compress (text: String ) : String {

    var compressedText = ""
    var nextLetterIndex = 1
    var sameCount = 1

    for(letter in text){

        var nextLetter : Char? = null

        if(nextLetterIndex != text.length)
        {
            nextLetter  = text[nextLetterIndex]
        }
      

        if(letter == nextLetter){
            sameCount += 1
        }
        else{
            compressedText += letter + sameCount.toString()
            sameCount = 1
        }

        nextLetterIndex += 1

    }

    return compressedText


}


fun main(){
    println(compress("aaabbbbcc"))
}