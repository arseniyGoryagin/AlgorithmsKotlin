

/*
Есть список событий с указанием времени их начала и окончания (в 24-часовом формате). Напишите алгоритм, определяющий, совпадают ли какие-либо
события. 
*/


import events



data class Event(
    val start : Int,
    val end : Int
)


var events = listOf(
    Event(12, 23),
    Event(33, 33),
    Event(44, 43),
    Event(1, 23),
    Event(2, 4),
    Event(13, 23),
 )


 fun isSame(events : List<Event>) : Boolean{


        val sortedEvents = events.sortedBy { it.start }


        val MAX_INDEX = events.size-1
     
        for (i in (0..MAX_INDEX)){

            if(i == MAX_INDEX){
                return false
            }

            val currentEvent = sortedEvents[i]
            val nextEvent = sortedEvents[i +1]

            if(currentEvent.start == nextEvent.start){
                return true
            }
        }

        return false
}


fun main(){
    println(isSame(events))
}