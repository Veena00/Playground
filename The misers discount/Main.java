#include<iostream>
using namespace std;
int main()
{
  float p1,p2,d,ta,dp,s;
  cin>>p1>>p2>>d;
  ta=p1+p2;
  float dp1=p1-(d/100)*p1;
  float dp2=p2-(d/100)*p2;
  dp=dp1+dp2;
  float s1=(d/100)*p1;
  float s2=(d/100)*p2;
  s=s1+s2;
  cout<<ta<<endl<<dp<<endl<<s;
  return 0;
}