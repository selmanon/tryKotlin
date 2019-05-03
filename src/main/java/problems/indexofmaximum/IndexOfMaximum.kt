package problems.indexofmaximum/*
 * Your task is to implement the problems.problems.indexofmaximum.indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */

fun indexOfMax(a: IntArray): Int? {
    if(a == null || a.size == 0) return null

    var largElement = a[0]
    var largElementIndex = 0

    for(elmentIndice in a.indices){
        if(a.get(elmentIndice) >= largElement) {
            largElement = a.get(elmentIndice)
            largElementIndex = elmentIndice
        }
    }

    return largElementIndex
}
