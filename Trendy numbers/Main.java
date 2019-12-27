#include<iostream>
using namespace std;
int main()
{
  int n,a,b;
  cin>>n;
  if(n/100==0)
    cout<<"Not a Trendy Number";
  else
  {a=n%100;
   b=a/10;
   if(b%3==0)
     cout<<"Trendy Number";
   else
     cout<<"Not a Trendy Number";
  }
  return 0;
}