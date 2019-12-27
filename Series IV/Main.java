#include<iostream>
using namespace std;
int main()
{
  int n,i=1;
  float s=0.5,s1;
  cin>>n;
  while(i<=n)
  {s1=s*3;
   cout<<s<<" ";
   i++;
   s=s1;
  }
  return 0;
}