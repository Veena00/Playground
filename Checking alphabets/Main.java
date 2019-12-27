#include<iostream>
using namespace std;
int main()
{
  char a;
  cin>>a;
  if((a=='a')||(a=='A')||(a=='e')||(a=='E')||(a=='i')||(a=='I')||(a=='o')||(a=='O')||(a=='u')||(a=='U'))
    cout<<"Vowel";
  else if((a=='b')||(a=='B')||(a=='c')||(a=='C')||(a=='d')||(a=='D')||(a=='f')||(a=='F')||(a=='g')||(a=='G')||(a=='h')||(a=='H')||(a=='j')||(a=='J')||(a=='k')||(a=='K')||(a=='l')||(a=='L')||(a=='m')||(a=='M')||(a=='n')||(a=='N')||(a=='p')||(a=='P')||(a=='q')||(a=='Q')||(a=='r')||(a=='R')||(a=='s')||(a=='S')||(a=='t')||(a=='T')||(a=='v')||(a=='V')||(a=='w')||(a=='W')||(a=='x')||(a=='X')||(a=='y')||(a=='Y')||(a=='z')||(a=='Z'))
    cout<<"Consonant";
  else
    cout<<"Not an alphabet";
  return 0;
}