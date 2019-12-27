#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,l,b;
  cin>>a>>l;
  b=(a*a*a)*1000;
  if(b>=l)
    cout<<"Can store";
  else
    cout<<"Cannot store";
  return 0;
}