


/*
Напишите алгоритм вывода пирамиды из звездочек с п уровнями. Например,
если п = 3, то результат должен выглядеть так: 

*
***
*****

 */



fun printTriangles (rows : Int){

    

    for(numTriangle in 1..rows){

        for(sapce in 1..rows-numTriangle){
            print(" ")
        }

        for(start in 1..(2 * numTriangle -1)){
            print("*")
        }


        println("\n")
    }
}



 fun main(){
    printTriangles(3)
 }
