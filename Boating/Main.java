#include<iostream>
using namespace std;
int main()
{
  int b,na,nc;
  cin>>b>>na>>nc;
  int t=(na*75)+(nc*30);
  if(t<b)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}