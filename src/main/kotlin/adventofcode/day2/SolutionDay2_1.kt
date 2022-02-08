package adventofcode.day2

import adventofcode.common.readDataFromFile

class SolutionDay2_1 {
    fun findPlannedCource() {
        val listOfCommands =
            readDataFromFile("/home/vgritsko/IdeaProjects/ProblemsSolving/src/main/resources/advent_day_2")

        var horizontalPos = 0
        var verticalPos = 0

        listOfCommands
            .forEach {
                val command = it.split(" ").first()
                val value = it.split(" ").last().toInt()
                when (command) {
                    COMMAND_FORWARD -> horizontalPos += value
                    COMMAND_UP -> verticalPos -= value
                    COMMAND_DOWN -> verticalPos += value
                    else -> println("Not correct data")
                }
            }
        println(horizontalPos * verticalPos)
    }

    companion object {
        const val COMMAND_FORWARD = "forward"
        const val COMMAND_UP = "up"
        const val COMMAND_DOWN = "down"

    }


}