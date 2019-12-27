#include<iostream>
using namespace std;
int main()
{
  int n,i=0,j=1,s=6;
  cin>>n;
  while(j<=n)
  {s=s+i;
   i=i+5;
   j++;
   cout<<s<<" ";
  }
  return 0;
}