package adventofcode.common.extensions

fun Int.bitwiseInversion(bytesSize: Int): Int {
    val mask = (1 shl bytesSize) - 1
    return this.inv() and mask
}