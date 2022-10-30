#include<bits/stdc++.h>
using namespace std;
void sort_rec(int arr[],int n)
{
    if(n==1)
    {
        return ;
    }
    for(int j=0;j<n-1;j++)
    {
        if(arr[j]>arr[j+1])
        {
            swap(arr[j],arr[j+1]);
        }
    }
    sort_rec(arr,n-1);
}
int main()
{
    int arr[]={12,3,423,1,23,5,31,5};
    int n=sizeof(arr)/sizeof(int);
    sort_rec(arr,n);
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}