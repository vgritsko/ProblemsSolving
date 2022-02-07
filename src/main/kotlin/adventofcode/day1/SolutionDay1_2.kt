package adventofcode.day1

import adventofcode.common.readDataFromFile

class SolutionDay1_2 {

    fun findSolution() {
        val listOfDepthMeasurements =
            loadDepthMeasurements("/home/vgritsko/IdeaProjects/ProblemsSolving/src/main/resources/advent_day_1")

        val listOfWindowedDepthMeasurements = listOfDepthMeasurements
            .windowed(SLIDING_WINDOW_SIZE)
            .map {
                it.reduce { acc, next ->
                    acc + next
                }
            }

        var depth = 0
        for (i in 1 until listOfWindowedDepthMeasurements.size) {
            if (listOfWindowedDepthMeasurements[i] > listOfWindowedDepthMeasurements[i - 1]) {
                println("${listOfWindowedDepthMeasurements[i]} increase")
                depth++
            }
        }
        print("depth: $depth")
    }

    private fun loadDepthMeasurements(fileName: String): List<Int> {
        val listOfStrings =
            readDataFromFile(fileName)
        return listOfStrings.map { it.toInt() }
    }

    companion object {
        const val SLIDING_WINDOW_SIZE = 3
    }
}