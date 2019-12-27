#include<iostream>
using namespace std;
int main()
{
  float a,b;
  cin>>a>>b;
  float c=b*12;
  float d=a-c;
  if(d<0)
    d=-(d);
  if(c<a)
    cout<<"Loss : Rs."<<d;
  else if(a<c)
    cout<<"Profit : Rs."<<d;
  else
    cout<<"No profit nor loss";
  return 0;
}