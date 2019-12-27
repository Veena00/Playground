#include<iostream>
using namespace std;
int main()
{
  int n,i,p=1,s;
  cin>>n;
  while(i<n)
  {s=p*3;
   cout<<s<<" ";
   p=s;
   i++;
  }
  return 0;
}