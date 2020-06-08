#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,d;
  cin>>a;
  if(a<=200)
  {
    d=(int)(a*0.5);
    cout<<"Rs."<<d;
  }
  else if(a<=400)
  {
    cout<<"Rs."<<a*0.65+100;
  }
  else if(a<=600)
  {
    cout<<"Rs."<<a*0.80+200;
  }
  else
  {
    cout<<"Rs."<<a*1.25+425;
  }
}