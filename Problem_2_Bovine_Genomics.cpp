#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>


using namespace std;


int main()
{   
    freopen("cownomics.in", "r", stdin); 
    freopen("cownomics.out", "w", stdout);
    int n, m;
    cin >> n >> m;
    vector<vector<int>> spotty;
    vector<vector<int>> plain;
    for(int i = 0; i < n; i++){
        vector<int> temp;
        string s;
        cin >> s;
        for(int j = 0; j < m; j++){
            if(s[j] == 'A'){
                temp.push_back(0);
            }
            else if(s[j] == 'C'){
                temp.push_back(1);
            }
            else if(s[j] == 'G'){
                temp.push_back(2);
            }
            else{
                temp.push_back(3);
            }
        }
        spotty.push_back(temp);
    }
    for(int i = 0; i < n; i++){
        vector<int> temp;
        string s;
        cin >> s;
        for(int j = 0; j < m; j++){
            if(s[j] == 'A'){
                temp.push_back(0);
            }
            else if(s[j] == 'C'){
                temp.push_back(1);
            }
            else if(s[j] == 'G'){
                temp.push_back(2);
            }
            else{
                temp.push_back(3);
            }
        }
        plain.push_back(temp);
    }

    int cnt = 0;
    
    for(int i = 0; i < m; i++){
        for(int j = i+1; j < m; j++){
            for(int k = j+1; k < m; k++){
                vector<int> temp(64, 0);
                for(int l = 0; l < n; l++){
                    // cout <<spotty[l][i]*16+spotty[l][j]*4+spotty[l][k] << endl;
                    temp[spotty[l][i]*16+spotty[l][j]*4+spotty[l][k]]++;
                }
                bool out = true;
                for(int l = 0; l < n; l++){
                    // cout <<temp[plain[l][i]*16+plain[l][j]*4+plain[l][k]] << endl;
                    if(temp[plain[l][i]*16+plain[l][j]*4+plain[l][k]] > 0){
                        out = false;
                    }
                }
                if(out){
                    cnt++;
                }
            }
        }
    }

    cout << cnt << endl;
    
}