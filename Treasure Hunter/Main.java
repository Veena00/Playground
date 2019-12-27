#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,b1,b2,n1,n2;
  double b1s,b2s,ps;
  cin>>n>>b1>>b2;
  b1s=(b1*n)/100;
  n1=n-b1s;
  b2s=(b2*n1)/100;
  n2=n1-b2s;
  ps=n2/3;
  cout<<(int)b1s<<endl<<(int)b2s<<endl<<(int)ps;
  return 0;
}