#include<iostream>
using namespace std;
int main()
{
  int u;
  cin>>u;
  float a;
  if(u<=200)
    a=0.5*u;
  else if((u>200)&&(u<=400))
    a=(0.65*u)+100;
  else if((u>400)&&(u<=600))
    a=(0.80*u)+200;
  else
    a=(1.25*u)+425;
  cout<<"Rs."<<(int)a;
  return 0;
}