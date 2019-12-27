#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int p,r,y;
  cin>>p>>r>>y;
  float i,a,d,f;
  i=(p*y*r)/100;
  a=p+i;
  d=0.02*i;
  f=a-d;
  cout<<i<<endl<<a<<endl<<d<<endl<<f;
}