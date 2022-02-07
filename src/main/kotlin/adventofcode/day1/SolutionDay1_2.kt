package adventofcode.day1

import adventofcode.common.readDataFromFile

class SolutionDay1_2 {

    fun findSolution() {
        val listOfDepthMeasurements =
            loadDepthMeasurements("/home/vgritsko/IdeaProjects/ProblemsSolving/src/main/resources/advent_day_1")

        val sums = listOfDepthMeasurements
            .windowed(size = SLIDING_TRIPLE_WINDOW,
                step = STEP,
                partialWindows = false,
                transform = { it.reduce { acc, next -> acc + next } })
            .windowed(size = SLIDING_DOUBLE_WINDOW, step = STEP, partialWindows = false, transform = { it[1] > it[0] })
            .filter { it }
            .size

        print("sums: $sums")
    }

    private fun loadDepthMeasurements(fileName: String): List<Int> {
        val listOfStrings =
            readDataFromFile(fileName)
        return listOfStrings.map { it.toInt() }
    }

    companion object {
        const val SLIDING_TRIPLE_WINDOW = 3
        const val SLIDING_DOUBLE_WINDOW = 2
        const val STEP = 1
    }
}