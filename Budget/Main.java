#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
  cin>>a>>b>>c>>d>>e;
  float j,f,g,h,i,k;
  j=a*350.34;
  f=b*230.90;
  g=c*190.55;
  h=d*125.30;
  i=e*180.90;
  k=j+f+g+h+i;
  if(k<15000)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}