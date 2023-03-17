#include<stdio.h>
#pragma pack (1)
#include<string.h>

struct bcci
{
   int jersey_no ;
   char name;
   int Runs;

union 
     {
      char goat;
      char legend ;
    
     }result ;

};

int main()
{
   struct bcci b1;
   printf("Enter the Jersey no,name of the player,Runs scored");
   scanf("%d%s%d%*c",&b1.jersey_no,&b1.name,&b1.Runs);
   
   if ( b1.Runs < 20000 )
   {
      printf("Enter the Runs scored by the LEGENDARY");
      scanf("%s",b1.result.legend);
   }   
   else
   {
       printf("Enter the Runs scored by the GOAT");
       scanf("%s",b1.result.goat);
   }

printf("Jersey_no :%d\nPlayer name :%s\nRuns scored :%d\n",b1.jersey_no,b1.name,b1.Runs); 
   if ( b1.Runs < 20000 )
   {
      printf("%s is a Legend",b1.name);
   }   
   else
   {
       printf("%s is Greatest of All Time",b1.name);
   }
    return 0;
}