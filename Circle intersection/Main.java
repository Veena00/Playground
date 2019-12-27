#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x1,y1,x2,y2,r1,r2;
  cin>>x1>>y1>>r1>>x2>>y2>>r2;
  int r3=r1+r2;
  int a=sqrt(pow((x1-x2),2)+pow((y1-y2),2));
  if(a==r3)
    cout<<"Tangential";
  else if(a>r3)
    cout<<"Do not Overlap";
  else
    cout<<"Overlap";
  return 0;
}