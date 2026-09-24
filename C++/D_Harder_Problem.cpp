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
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        vector<int> v;
        for (int i = 0; i < n; i++){
            int x;
            cin >> x;
            v.push_back(x);
        }
        vector<int> fin;
        vector<int> counts;
        for(int i = 0; i < n; i++){
            counts.push_back(0);
        }
        int curMode = 0;
        int curCount = 0;
        for(int i = 0; i < v.size(); i++){
            if(curMode != v[i]){
                fin.push_back(v[i]);
                if(counts[v[i]-1] - curCount < 1){
                    counts[v[i]-1]++;
                    curCount = counts[v[i]-1];
                    curMode = v[i];
                }
            }
            else{
                fin.push_back(0); // fix
            }
        }
        for(auto i : fin){
            cout << i << " ";
        }
        cout << endl;

    }
   
}