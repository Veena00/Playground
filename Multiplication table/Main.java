#include<iostream>
using namespace std;
int main()
{
  int n,m,i=1,p;
  cout<<"Enter n"<<endl;
  cin>>n;
  cout<<"Enter m"<<endl;
  cin>>m;
  cout<<"The multiplication table of "<<n<<" is"<<endl;
  while(i<m+1)
  {p=i*n;
   cout<<i<<"*"<<n<<"="<<p<<endl;
   i++;
  }
  return 0;
}