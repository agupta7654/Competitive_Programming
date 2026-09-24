#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
//    string s;
//    cin >> s;
//    bool out = false;
//    for(int i = s.length()/2+1; i >= 1; i--){
//     string sub = s.substr(i);
//     int diffLen = sub.length() - s.substr(0,i).length();
//     if(s.substr(0, i+diffLen) == sub){
//         if(diffLen != 0){  
//         out = true;
//         cout << "YES" << endl;
//         cout << sub << endl;
//         break;
//         }
        
//     }
//    }
//     if(!out){
//         cout << "NO" << endl;
//     }
    int cnt = 0;
    vector<int> vals;
    for(int i = 1; i < 100; i++){
        double value = pow(i,100) % 125;
        if(vals.find(value) == -1){
            vals.push_back(value);
            cnt++;
        }
    }
}   