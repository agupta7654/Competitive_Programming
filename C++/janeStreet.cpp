#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>
#include <algorithm>


using namespace std;
using vi = vector<int>;
using vvi = vector<vi>;
using ii = pair<int, int>;
using vii = vector<ii>;
using ll = long long;
using vll = vector<ll>;
using vvll = vector<vll>;
using ld = long double;
using pll = pair<ll, ll>;
using vb = vector<bool>;

bool test(vll vec){
    if(abs(vec[9]-vec[8]) == vec[5] && abs(vec[8]-vec[7]) == vec[4] && abs(vec[7]-vec[6]) == vec[3] && abs(vec[5]-vec[4]) == vec[2] && abs(vec[4]-vec[3]) == vec[1] && abs(vec[2]-vec[1]) == vec[0]){
        for(int i = 0; i < vec.size(); i++){
            cout << vec[i] << " ";
        }
        cout << endl;
        return true;
    }
    return false;
}  

int main()
{   
    vll nums = {10,9,8,7,6,5,4,3,2,1};
    vector<vll> works;

    do {
        bool x = test(nums);

    } while (prev_permutation(nums.begin(), nums.end()));

    

    return 0;


}