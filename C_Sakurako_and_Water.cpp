#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
   int t;
   cin >> t;
   while(t--){
    int n;
    cin >> n;
    vector<vector<int>> vals;
    for(int i = 0; i < 2*n-1; i++){
        vals.push_back(vector<int>());
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            int x;
            cin >> x;
            vals[j-i+n-1].push_back(x);
        }
    }
    int cnt = 0;
    for(int i = 0; i < 2*n-1; i++){
        int min = vals[i][0];
        for(int j = 0; j < vals[i].size(); j++){
            if(min > vals[i][j]){
                min = vals[i][j];
                // cout << min << endl;
            }
        }
        if(min < 0){
            // cout << min << endl;
            cnt -= min;
        }
        // cout << endl;
    }
    cout << cnt << endl;
        
    }
   
   
}