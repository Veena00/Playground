#include<iostream>
using namespace std;
int main()
{
  
  int r,c,n;
  cin>>r>>c>>n;
  int d=c+2-c;
  int e=c-1;
  int f=r+2-r;
  int g=r-1;
  if((r*c)%2!=0)
    cout<<"It is a mango tree";
  else
     cout<<"It is not a mango tree";
  return 0;
}