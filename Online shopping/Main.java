#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  float p1,p2,p3;
  p1=a+c-(b*a)/100;
  p2=d+f-(e*d)/100;
  p3=g+i-(h*g)/100;
  cout<<"In Flipkart Rs."<<p1<<endl;
  cout<<"In Snapdeal Rs."<<p2<<endl;
  cout<<"In Amazon Rs."<<p3<<endl;
  if((p1<=p2)&&(p1<=p3))
    cout<<"He will prefer Flipkart";
  else if((p2<=p1)&&(p2<=p3))
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  return 0;
}