#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  cin>>a>>b>>c>>d>>e>>f;
  int a1,a2,a3,s;
  a1=a*b;
  a2=c*d;
  a3=e*f;
  s=a2+a3;
  if(s<a1)
    cout<<"Raj can fix both painting";
  else
    cout<<"Raj cannot fix both painting";
  return 0;
}