#include<iostream>
using namespace std;
int main()
{
  float r,h,l,t;
  cin>>r>>h>>l>>t;
  float a=3.14*r*r*h;
  float y=l*t;
  if(y>=a)
    cout<<"The tank can be filled within "<<t<<" hours";
  else
    cout<<"The tank cannot be filled within "<<t<<" hours";
  return 0;
}