/*
 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
 */
package runs

fun runs(a: IntArray): Int {
    if(a.size == 0)
        return 0

    var runs = 1
    var differentRun = a[0]

    for(runIndice in a.indices)
        if(differentRun != a[runIndice]){
            runs++;
            differentRun = a[runIndice]
        }
    return runs
}