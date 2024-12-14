#include <iostream>
#include <vector>
#include <string>

using namespace std;

int solve(vector<int> b, vector<string> o){
    for(int i = o.size()-1; i >= 0; i--){
        if(o[i] == "and"){
            b[i] = int(b[i] & b[i+1]);
            b.erase(b.begin() + i+1);
            o.erase(o.begin() + i);  
        }
    }
    for(int i = o.size()-1; i >= 0; i--){
        b[i] = int(b[i] | b[i+1]);
        b.erase(b.begin() + i+1);
        o.erase(o.begin() + i);  
        
    }
    return b[0];
}

int main()
{
    int n, q;
    cin >> n >> q;
    vector<int> b;
    vector<string> o; 
    for (int i = 0; i < n; i++)
    {
        string val;
        cin >> val;
        if(i % 2 == 0){
            if(val == "false"){
                b.push_back(0);
            }
            else{
                b.push_back(1);
            }
        }
        else{
            o.push_back(val);
        }
    }
    b.erase(b.begin(), b.begin());
    for(int i = 0 ;i < q; i++){
        int l, r;
        string ans;
        cin >> l >> r >> ans;
        
        vector<int> b2 = b;
        b2[l/2] = 0;
        b2.erase(b2.begin() + l/2 + 1, b2.begin() + r/2);
        o.erase(o.begin() + ((r-l)/2)-1);
        int fin = solve(b2, o);
        
        vector<int> b3 = b;
        b3[l/2] = 1;
        b3.erase(b3.begin() + l/2 + 1, b3.begin() + r/2);
        o.erase(o.begin() + ((r-l)/2)-1);
        int fin2 = solve(b3, o);
        
        if(ans == "true"){
            if(fin == 1 || fin2 == 1){
                cout << "Y";
            }
            else{
                cout << "N";
            }
        }
        else{
            if(fin == 0 || fin2 == 0){
                cout << "Y";
            }
            else{
                cout << "N";
            }
        }
    }
    
}   