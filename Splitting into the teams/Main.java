#include<iostream>
using namespace std;
int main()
{
  int s,n;
  cin>>s>>n;
  int a=s/n;
  int b=s%n;
  cout<<"The number of students in each team is "<<a<<" and left out is "<<b;
  return 0;
}