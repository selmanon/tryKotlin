/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
package palindrome

fun isPalindrome(s: String): Boolean {
    if (s.length == 1) return true

    var startIndice = 0
    var endIndice = s.lastIndex

    for (indice in s.indices) {
        if (s[startIndice] == s[endIndice]) {
            startIndice++
            endIndice--
        } else {
            return false
        }

        if (s.length % 2 == 0 && startIndice > endIndice) return true

        if (s.length % 2 != 0 && startIndice == endIndice) return true
    }

    return true
}
