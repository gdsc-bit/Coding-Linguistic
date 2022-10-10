## Problem Description

Given an array A of positive integers,call a (contiguous,not necessarily distinct) subarray of A good if the number of different integers in that subarray is exactly B.

(For example: [1, 2, 3, 1, 2] has 3 different integers 1, 2 and 3)

Return the number of good subarrays of A.


## Example Input

Input 1:

 A = [1, 2, 1, 2, 3]
 B = 2

Input 2:

 A = [1, 2, 1, 3, 4]
 B = 3



## Example Output

Output 1:

 7

Output 2:

 3



## Example Explanation

### Explanation 1:

  Subarrays formed with exactly 2 different integers: [1, 2], [2, 1], [1, 2], [2, 3], [1, 2, 1], [2, 1, 2], [1, 2, 1, 2].

### Explanation 2:

  Subarrays formed with exactly 3 different integers: [1, 2, 1, 3], [2, 1, 3], [1, 3, 4].
