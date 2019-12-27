#include<iostream>
using namespace std;
int main()
{
  int n,i=1,s=121,s1=104,s2=0;
  cin>>n;
  while(i<=n)
  {s=s+s2;
   cout<<s<<" ";
   s2=s1;
   s1=s1+32;
   i++;
  }
  return 0;
}