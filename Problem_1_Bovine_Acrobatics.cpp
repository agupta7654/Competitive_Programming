#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>


using namespace std;


int main()
{
    // freopen("billboard.in", "r", stdin); 
    // freopen("billboard.out", "w", stdout);
    int n, m, k;
    cin >> n >> m >> k;
    vector<pair<int,int>> weight;

    for(int i = 0; i < n; i++){
        int w, c;
        cin >> w >> c;
        weight.emplace_back(w,c);
    }

    sort(weight.begin(), weight.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
        if (a.first != b.first)
            return a.first > b.first;
        return a.second > b.second;
    });    

    vector<vector<int>> towers;
    for(int i = 0 ; i < m; i++){
        vector<int> temp;
        towers.push_back(temp);
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(towers[j].size() == 0){
                // cout << weight[i].first << endl;
                towers[j].push_back(weight[i].first);
                weight[i].second--;
                if(weight[i].second > 0){
                    i--;
                }
                break;
            }
            else if(towers[j][towers[j].size()-1] - k >= weight[i].first){
                // cout << weight[i].first << endl;
                towers[j].push_back(weight[i].first);
                weight[i].second--;
                if(weight[i].second > 0){
                    i--;
                }
                break;
            }
            
        }
    }
    long long cnt = 0;
    for(int i = 0 ; i < m; i++){
        cnt += towers[i].size();
    }

    // for(auto i : towers){
    //     for(auto j : i){
    //         cout << j << " ";
    //     }
    //     cout << endl;
    // }

    cout << cnt << endl;




}