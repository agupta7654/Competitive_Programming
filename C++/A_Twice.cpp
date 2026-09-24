#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
    int t = 0;
    cin >> t;
    while(t--){
        int vals[21] = {0};
        int n = 0;
        cin >> n;
        for(int i = 0; i < n; i++){
            int x = 0;
            cin >> x;
            // cout << x << endl;
            vals[x] += 1;
        }
        int cnt = 0;
        for(int i = 1; i < 21; i++){
            // cout << vals[i] << endl;
            cnt += vals[i] / 2;
        }
        cout << cnt << endl;
    }
}   