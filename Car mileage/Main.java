#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,d;
  cin>>m>>l>>d;
  float c=m*l;
  if(c<d)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
  return 0;
}