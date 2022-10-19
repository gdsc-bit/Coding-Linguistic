// CPP program to find the Largest Coprime Divisor 

#include <bits/stdc++.h>
 using namespace std;

// function to find largest coprime divisor

int cp(int A, int B) 
{
      int n = __gcd(A,B); 		// calculates gcd of A and B
      if(n==1) 
	 return A;
      return cp(A/n,B);		// reccursive function call
}

// divisor code

int main()
{
      int a,b;
      cin>>a>>b;

      cout<<cp(a,b);
      return 0;
}
