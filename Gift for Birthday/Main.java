#include<iostream>
using namespace std;
int main()
{
  int y;
  cin>>y;
  int x=y%4;
  if(x==0)
    cout<<y<<" is a leap year";
  else
    cout<<y<<" is not a leap year";
  return 0;
}