package adventofcode.day1

import adventofcode.common.readDataFromFile

class SolutionDay1_1 {
    fun findSolution() {
        val listOfDepthMeasurements =
            loadDepthMeasurements("/home/vgritsko/IdeaProjects/ProblemsSolving/src/main/resources/advent_day_1")
        var depth = 0
        for (i in 1 until listOfDepthMeasurements.size) {
            if (listOfDepthMeasurements[i] > listOfDepthMeasurements[i - 1]) {
                println("${listOfDepthMeasurements[i]} increase")
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
}