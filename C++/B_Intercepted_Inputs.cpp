#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
    int t = 0;
    cin >> t;
    while(t--){
        int k;
        cin >> k;
        vector<int> vals;
        for (int i = 0; i < k; i++){
            int x;
            cin >> x;
            vals.push_back(x);
        }
        int target = k-2;
        // cout << target << endl;
        for(int i = 1; i <= target; i++){
            if(target % i == 0){
                bool one = false;
                bool two = false;
                for(int j = 0; j < k; j++){
                    if(vals[j] == i && one == false){
                        one = true;
                    }
                    else if(vals[j] == target/i){
                        two = true;
                    }
                }                
                if(one && two){
                    cout << i << " " << target/i << endl;
                    break;
                }
            }
        }
    }
}   