#include <iostream> 
using namespace std; 
  
// Main program 
main() 
{ 
    int op; 
    int num1, num2; 
 
  cin>>num1;
 
  cin>>num2;
   cin>>op;
  cout<<"Enter first number : Enter second number : Menu"<<endl;
  cout<<"1.Addition"<<endl<<"2.Subtraction"<<endl<<"3.Multiplication"<<endl<<"4.Division"<<endl<<"5.Remainder"<<endl;
  
  
  
   
  
 
   // Switch statement begins 
    switch (op) { 
          
        // If user enter +  
        case 1: 
            cout << num1 + num2; 
            break; 
          
        // If user enter -  
        case 2: 
            cout << num1 - num2; 
            break; 
          
        // If user enter * 
        case 3: 
            cout << num1 * num2; 
            break; 
          
        // If user enter / 
        case 4: 
            cout << num1 / num2; 
            break; 
         case 5: 
            cout << num1 % num2; 
            break; 
          
        // If the operator is other than +, -, * or /,  
        // error message will display 
        default: 
            cout << "Invalid operation"; 
            break; 
    } // switch statement ends 
  
    return 0;  
} 