# Min XOR value

> Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

### Sample Input
 Input 1:
    
    A = [0, 2, 5, 7]
    
Input 2:

    A = [0, 4, 7, 9]


### Sample Output

Example Output 1:

    2
Explanation:

    0 xor 2 = 2
    
Output 2:
    
    3
    
### Constraints:

2 <= N <= 10<sup>5</sup>  
0 <= A[i] <= 10<sup>9</sup>

### Code :

    def solve(l):
        l.sort();
        min_xor = 999999999
        val = 0
        n = len(l)
        # calculate min xor of consecutive pairs
        for i in range (0, n-1):
            for j in range (i+1, n-1):
                val = l[i] ^ l[j]
                min_xor = min(min_xor, val)
        print(min_xor)
    
    def main():
       l = list(map(int, input().split()))
       solve(l)

    if __name__ == "__main__":
       main()
       
       
