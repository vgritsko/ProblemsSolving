package adventofcode.day2

import adventofcode.common.readDataFromFile
import kotlin.properties.Delegates

class SolutionDay2_2 {
    private var aimPosition by Delegates.notNull<Int>()
    private var depthPosition by Delegates.notNull<Int>()
    private var horizontalPosition by Delegates.notNull<Int>()

    fun findPlannedCource() {
        val listOfCommands =
            readDataFromFile("/home/vgritsko/IdeaProjects/ProblemsSolving/src/main/resources/advent_day_2")

        aimPosition = 0
        depthPosition = 0
        horizontalPosition = 0

        listOfCommands
            .forEach {
                val command = it.split(" ").first()
                val value = it.split(" ").last().toInt()
                when (command) {
                    COMMAND_FORWARD -> changeHorizontalPosition(value)
                    COMMAND_UP -> changeVerticalPositionUp(value)
                    COMMAND_DOWN -> changeVerticalPositionDown(value)
                    else -> println("Not correct data")
                }
            }
        println(horizontalPosition * depthPosition)
    }

    private fun changeHorizontalPosition(value: Int) {
        horizontalPosition += value
        depthPosition += value * aimPosition
    }

    private fun changeVerticalPositionUp(value: Int) {
        aimPosition -= value
    }

    private fun changeVerticalPositionDown(value: Int) {
        aimPosition += value
    }

    companion object {
        const val COMMAND_FORWARD = "forward"
        const val COMMAND_UP = "up"
        const val COMMAND_DOWN = "down"

    }
}