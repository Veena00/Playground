#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int e=0;
  if(a>d)
  {if((b>d)&&(c>d))
      e=e+3;
   else if(b>d)
      e=e+2;
   else if(c>d)
      e=e+2;
   else
      e=e+1;
  }
  else if(b>d)
  {if((a>d)&&(c>d))
    e=e+3;
   else if(a>d)
     e=e+2;
   else if(c>d)
     e=e+2;
   else
     e=e+1;
  }
  else if(c>d)
  {if((a>d)&&(b>d))
    e=e+3;
   else if(a>d)
     e=e+2;
   else if(b>d)
     e=e+2;
   else
     e=e+1;
  }
  else
    e=0;
  cout<<e;
  return 0;
  
}