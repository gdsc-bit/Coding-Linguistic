#include<bits/stdc++.h>
using namespace std;
int power(int a,int n)
{
   if(n==0)
   {
    return 1;
   }
   int subAns = power(a,n/2);
   int Sq= subAns*subAns;
   if(n&1)
   {
    return a*Sq;
   }
   return Sq;
}
int main()
{
    int a,n;
    cin>>a>>n;
    cout<<power(a,n);

}