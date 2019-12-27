#include<iostream>
using namespace std;
int main()
{
  int m,n,a,s,p,o,t,os;
  cin>>m>>n;
  a=m;
  while(a<=n)
  {o=a/10;
   t=a%10;
   s=o+t;
   p=o*t;
   os=s+p;
   if(os==a)
     cout<<a<<endl;
   a++;
   }
  return 0;
}