#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int max;
  if((a>b)&&(a>c))
  {if(b>c)
    max=b;
   else
     max=c;
  }
  else if((b>c)&&(b>a))
  {if(a>c)
    max=a;
   else
     max=c;
  }
  else
  {if(a>b)
    max=a;
   else
     max=b;
  }
  cout<<"The treasure is in box which has number "<<max;
  int pro,hcf,i;
  pro=a*b*c;
  for(i=1;i<=pro;i++)
  {if((a%i==0)&&(b%i==0)&&(c%i==0))
    hcf=i;
  }
  cout<<endl<<"The code to open the box is "<<hcf;
  return 0; 
}