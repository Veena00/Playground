#include<iostream>
using namespace std;
int main()
{
  int n,i=1,j=1,s=0;
  cin>>n;
  while(j<=n)
  {s=s+i;
   i=i+2;
   j++;
  cout<<s<<" ";
  }
  return 0;
}