#include  <stdio.h>
int Fibonacci(int );
void main()
{
  int i=0,n,c;
  printf("Enter the number of terms ");
  scanf("%d",&n);
  printf("Fibonacci series \n);
         for(c=1;c<=n;c++)
         {
           printf("%d\n",Fibonacci(i));
           i++;
         }
 }
         int Fibonacci(int n)
         {
           if(n==0||n==1)
             return n;
           else
             return (Fibonacci(n-1)+Fibonacci(n-2));
         }
         
