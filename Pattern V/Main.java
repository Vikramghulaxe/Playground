#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int num=n;
  int space; 
      
    int i, j, lterm, rterm; 
  
    // The terms on the LHS of the pattern  
    lterm = 1;  
  
    // The terms on the RHS of the pattern 
    rterm = num * num + 1; 
  
  for(int i=n;i>=1;i--)
  {
    for (space = num; space > i; space--) 
            cout << "--"; 
  
        for (j = 1; j <= i; j++) { 
            cout << lterm; 
            cout << "*"; 
            lterm++; 
        } 
        for (j = 1; j <= i; j++) { 
            cout << rterm; 
            if (j < i) 
                printf("*"); 
            rterm++; 
        } 
  
        // To get the next term on RHS of the Pattern  
        rterm = rterm - (i - 1) * 2 - 1; 
        cout << endl; 
    
  }
}
