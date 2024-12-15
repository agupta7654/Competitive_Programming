#include <iostream>
#include <vector>
#include <string>
#include <cmath> 
#include <set>
#include <bits/stdc++.h>


using namespace std;


int main()
{
    // freopen("billboard.in", "r", stdin); 
    // freopen("billboard.out", "w", stdout);

    int n, f;
    cin >> n >> f;
    string s;
    cin >> s;
    set<string> words;

    // F=1
    if(f == 1){
        for(int i = 0; i < n-2; i++){
            string cut = s.substr(i, 3);
            if(cut[1] == cut[2]){
                for(int j = 97; j < 123; j++){
                    if(!((cut[1] == char(j)))){
                        string add = "";
                        add += char(j);
                        add += cut[1];
                        add += cut[2];
                        // cout << add << endl;  
                        words.insert(add);
                   }
                }
            }
            else{
                string add = "";
                add += cut[0];
                add += cut[1];
                add += cut[1];
                words.insert(add);
            }
        }
    }

    // f>1
    else{
        vector<string> curVals;
        vector<int> curCount;
        vector<int> startIndex;
        vector<int> endIndex;

        for(int i = 0; i < n-2; i++){
            string cut = s.substr(i, 3);
            bool done = false;
            for(int in = 0; in < curVals.size(); in++){
                if(curVals[in] == cut){
                    curCount[in] += 1;
                    done = true;
                    break;
                }
            }
            if(!done && cut[1] == cut[2] && cut[0] != cut[1]){
                curVals.push_back(cut);
                curCount.push_back(1);
            }
        }

        vector<string> finVals = curVals;
        vector<int> finCount = curCount;

        for(int i = 0; i < n-2; i++){
            string cut = s.substr(i, 3);
            if(cut[1] == cut[2] ){
                for(int j = 97; j < 123; j++){
                    if(cut[1] != char(j) && cut[0] != char(j)){
                        string add = "";
                        add += char(j);
                        add += cut[1];
                        add += cut[2];
                        bool done = false;
                        for(int in = 0; in < curVals.size(); in++){
                            if(curVals[in] == add){
                                if(i < startIndex[in]-2 || i > endIndex[in]){
                                    finCount[in] += 1;
                                    done = true;
                                    break;
                                }
                            }
                        }
                        if(!done){
                            finVals.push_back(add);
                            finCount.push_back(1);
                            startIndex.push_back(i);
                            endIndex.push_back(i+2);
                        }
                    }
                }
            }
            else if(cut[0] == cut[1]){
                string add = "";
                add += cut[0];
                add += cut[2];
                add += cut[2];
                // if(add == "ozz"){
                //             cout << i << endl;
                //         }
                bool done = false;
                for(int in = 0; in < curVals.size(); in++){
                    if(curVals[in] == add){
                        finCount[in] += 1;
                        done = true;
                        break;
                    }
                }
                if(!done){
                    finVals.push_back(add);
                    finCount.push_back(1);
                    startIndex.push_back(i);
                    endIndex.push_back(i+2);
                }
            }
            else if(cut[0] == cut[2]){
                string add = "";
                add += cut[0];
                add += cut[1];
                add += cut[1];
                
                bool done = false;
                for(int in = 0; in < curVals.size(); in++){
                    if(curVals[in] == add){
                        if(i < startIndex[in]-2 || i > endIndex[in]){
                                    finCount[in] += 1;
                                    done = true;
                                    break;
                                }
                    }
                }
                if(!done){
                    finVals.push_back(add);
                    finCount.push_back(1);
                    startIndex.push_back(i);
                    endIndex.push_back(i+2);
                }
            }

            //zzm
            //mmm
        } 

        for(auto val : finCount){
            cout << val << endl;
        }

        vector<string> finalWords;

        for(int i = 0; i < finVals.size(); i++){
            if(finCount[i] >= f){
                finalWords.push_back(finVals[i]);
            }
        }

        cout << finalWords.size() << endl;
        sort(finalWords.begin(), finalWords.end());
        for(auto val : finalWords){
            cout << val << endl;
        }
    }
   
}