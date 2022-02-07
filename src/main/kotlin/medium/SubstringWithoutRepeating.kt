package medium

class SubstringWithoutRepeating {

    fun lengthOfLongestSubstring(s: String): Int {
        val result = hashSetOf<Char>()
        var maxLength = 0

        if (s.length <= 1) return s.length

        for (i in 0..s.lastIndex) {
            s.substring(i, s.length)
                .asSequence()
                .takeWhile { !result.contains(it) }
                .forEach { result.add(it) }

            if (result.size>maxLength) maxLength = result.size
            result.clear()
        }
        return maxLength
    }
}