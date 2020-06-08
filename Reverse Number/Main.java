#include <stdio.h>
#include <stdlib.h>
int main() 
{
	// Type your code here
  int num,tmp;
  scanf("%d",&num);
  while(num>0)
  {
    tmp=num;
    num=num%10;
    printf("%d",num);
    num=tmp/10;
    //printf("%d",num);
  }
	return 0;
}