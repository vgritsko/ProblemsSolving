package adventofcode.common

import java.io.File

fun readDataFromFile(fileName: String): List<String> {
    val listOfStrings = mutableListOf<String>()
    File(fileName).readLines().forEach {
        listOfStrings.add(it)
    }
    return listOfStrings.toList()
}