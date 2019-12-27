#include<iostream>
using namespace std;
int main()
{
  
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int e,f;
  e=a+c;
  f=b+d;
  if(f>99)
  {e=e+(f/100);
   f=f%100;
  }
  cout<<e<<endl<<f;
  return 0;
}