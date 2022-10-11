# Largest Coprime Divisor

 >You are given two positive numbers A and B. You need to find the maximum valued integer X such that :
    X divides A i.e. A % X = 0  , 
    X and B are co-prime i.e. gcd(X, B) = 1

### Sample Input
A = 30

B = 12

### Sample Output
X = 5

### Constraints
1<=A,B<=10<sup>9</sup>

### Code 

    #include <bits/stdc++.h>
    using namespace std;

    int cp(int A, int B) 
    {
      int n = __gcd(A,B);
      if(n==1) 
        return A;
      return cp(A/n,B);
    }
    int main()
    {
      int a,b;
      cin>>a>>b;
      cout<<cp(a,b);
      return 0;
    }
