#include<iostream>
using namespace std;

int main() {
    int a, b;
    cout<<"Enter 1:SUM, 2:SUB, 3:MUL, 4:DIV";
    cout<<"\nEnter Ur choice:";
    int choice;
    cin>>choice;

    switch(choice) {
        case 1:
            cout<<"a=:";
            cin>>a;
            cout<<"b=:";
            cin>>b;
            cout<<"SUM:"<<a+b;
            break;
        case 2:
            cout<<"a=:";
            cin>>a;
            cout<<"b=:";
            cin>>b;
            cout<<"SUB:"<<a-b;
            break;
        case 3:
            cout<<"a=:";
            cin>>a;
            cout<<"b=:";
            cin>>b;
            cout<<"MUL:"<<a*b;
            break;
        case 4:
            cout<<"a=:";
            cin>>a;
            cout<<"b=:";
            cin>>b;
            cout<<"DIV:"<<a/b;
            break;
        default:
            cout<<"Plz enter correct choice.";
            
    }

}