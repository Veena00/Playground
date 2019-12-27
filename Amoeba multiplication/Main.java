#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c=1,i,d[100];
  cin>>a;
  for(i=0;i<=a;i++)
  {d[i]=b+c;
   b=c;
   c=d[i];
  }
  cout<<d[a-3];
  return 0;
}