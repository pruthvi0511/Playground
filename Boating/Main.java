#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a>>b>>c;
  d=(b*75)+(c*30);
  if(d<=a)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}