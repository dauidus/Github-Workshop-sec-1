// nothing to see here
//  main.cpp
//  project9
// kekw
//  Created b on 12/15/20.
//

#include <iostream>
#include <iomanip>

using namespace std;

class romanType{

private:
    
    string romanNumerals="";
    unsigned int posInt=0;
    

public:
    
    void add (char c){
        switch (c){
            case 'M':posInt+=1000;break;
            case 'D':posInt+=500;break;
            case 'C':posInt+=100;break;
            case 'L':posInt+=50;break;
            case 'X':posInt+=10;break;
            case 'V':posInt+=5;break;
            case 'I':posInt+=1;break;
            default:break;
        }
    }
    
    void printInt(){
        cout << posInt;
    }
    
    void printRoman(){
        cout << romanNumerals;
    }
    
    void reset(){
        posInt=0;
        romanNumerals="";
    }
    
    void sendString(string s){
        romanNumerals=s;
    }
    
};

int main() {
    char c=' ';
    romanType numeral;
    string roman="";
    
    cout << "Input the roman numeral (Q to stop):";
    cin >> c;
    while(c!='Q'){
        roman+=c;
        numeral.add(c);
        while(cin.peek()!='\n'){
            cin >> c;
            roman+=c;
            numeral.add(c);
        }
    
        numeral.sendString(roman);
    
        cout << endl << "Integer value: ";
        numeral.printInt();
        cout << endl << "Roman Numerals: ";
        numeral.printRoman();
        cout << endl;
        
        numeral.reset();
        cout << "Input the roman numeral (Q to stop):";
        roman="";
        cin >> c;
    }
    
    return 0;
}
