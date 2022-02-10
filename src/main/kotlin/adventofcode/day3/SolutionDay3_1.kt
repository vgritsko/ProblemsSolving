package adventofcode.day3

import adventofcode.common.extensions.bitwiseInversion
import adventofcode.common.readDataFromFile


class SolutionDay3_1 {

    fun calculatePowerConsumption() {
        val diagnosticReport =
            readDataFromFile("/home/vgritsko/IdeaProjects/ProblemsSolving/src/main/resources/advent_day_3")

        val gammaRate = calculateGammaRate(diagnosticReport)
        val epsilonRate = gammaRate.bitwiseInversion(gammaRate.toBigInteger().bitLength() + 1)
        val res = gammaRate * epsilonRate
        println(res)
    }

    private fun convertDiagnosticReport(diagnosticReport: List<String>): List<String> {
        val convertedDiagnosticReport = mutableListOf<String>()
        val maxLength = diagnosticReport.first().length
        for (charIndex in 0 until maxLength) {
            val charsList = diagnosticReport.map { it[charIndex] }
            val str = charsList.joinToString("", "")
            convertedDiagnosticReport.add(str)
        }
        return convertedDiagnosticReport
    }


    private fun calculateGammaRate(diagnosticReport: List<String>): Int {
        val convertedDiagnosticReport = convertDiagnosticReport(diagnosticReport)
        val gammaRateChars = mutableListOf<Char>()
        convertedDiagnosticReport.forEach { s ->
            val key = s.groupingBy { it }.eachCount().maxBy { it.value }?.key
            if (key != null) {
                gammaRateChars.add(key)
            }
        }
        val gammaRateBinary = gammaRateChars.joinToString("")
        return Integer.parseUnsignedInt(gammaRateBinary, 2)
    }
}