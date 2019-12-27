#include<iostream>
using namespace std;
int main()
{
  int n,i,a[100],c;
  cin>>n;
  a[0]=n;
  for(i=0;i<50;i++)
  {if(n%2==0)
     a[i+1]=n/2;
   else
     a[i+1]=(3*n)+1;
   n=a[i+1];
  }
  for(i=0;i<50;i++)
  {
   cout<<a[i]<<endl;
    if(a[i]==1)
      break;
    else
      c=c+1;
  }
  cout<<c;
  return 0;
}