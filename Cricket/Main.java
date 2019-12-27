#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  float e,f,g,h,i,j;
  e=a/6;
  f=d/6;
  i=d%6;
  j=f+(i/10);
  g=(float)c/j;
  h=(float)b/e;
  std::cout<<std::fixed;
  cout<<(int)e<<endl<<std::setprecision(1)<<(float)j<<endl<<std::setprecision(1)<<g<<endl<<std::setprecision(1)<<h<<endl;
  if(g>h)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
}