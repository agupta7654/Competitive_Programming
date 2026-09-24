#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>


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

void solve(){
    int n;
    cin >> n;
    vll cows(n);
    vll order(n);
    vll reverse(n);
    for(int i = 0; i < n; i++){
        cin >> cows[i];
    }
    for(int i = 0; i < n; i++){
        cin >> order[i];
    }
    for(int i = 0; i < n; i++){
        reverse[i] = cows[n-1-i];
    }

    vvll all(n*(n+1)/2);
    vvll counts(n);
    int curIndex = 0;

    for(int l = 0; l < n; l++){
        for(int r = l; r < n; r++){
            vll newCows(n);
            for(int i = 0; i < l; i++){
                newCows[i] = cows[i];
            }
            for(int i = l; i <= r; i++){
                newCows[i] = reverse[n-r+i-1-l];
            }
            for(int i = r+1; i < n; i++){
                newCows[i] = cows[i];
            }
            all[curIndex] = newCows;
            curIndex++;
        }
    }

    for(int c = 0; c < n; c++){
        vll temp(n);
        for(int r = 0; r < all.size(); r++){
            temp[all[r][c]-1]++;
        }
        counts[c] = temp;
    }

    for(vll i : counts){
        for(auto j : i){
            cout << j << " ";
        }
        cout << endl;
    }


    vvll test(n, vll(n));
    for(int c = 0; c < n; c++){
        for(int r = 0; r < n; r++){
            if(r != c){
                if(r + )
            }
        }
        if(c >= n/2){
            test[c][c] = n*(n+1)/2 - ((n-c-1)*(n-c) + (n-c)*(n-2*(n-c-1)-1));
        }
        else{
            test[c][c] = n*(n+1)/2 - (c*(c+1) + (c+1)*(n-2*c-1));
        }
    }

    for(auto i : test){
        for(auto j : i){
            cout << j << " ";
        }
        cout << endl;
    }

    // vll good(n);
    // if(cows[0] == order[0]){
    //     good[0] = 1;
    // }
    // for(int i = 1;  i < n; i++){
    //     if(cows[i] == order[i]){
    //         good[i] = good[i-1] + 1;
    //     }
    //     else{
    //         good[i] = good[i-1];
    //     }
    // }

    ll cnt = 0;
    ll usedCowCount = 0;

    // for(int l = 0; l < n; l++){
    //     for(int r = l; r < n; r++){
    //         for(int i = l; i < n; i++){
    //             if(i <= r){
    //                 if(reverse[n-r+i-1-l] == order[i]){
    //                     cnt++;
    //                 }
    //             }
    //         }
    //         if(l > 0){
    //             cnt += good[l-1];
    //         }
    //         cnt += good[n-1] - good[r];
    //     }
    // }

    

    cout << cnt << endl;

    
}

int main()
{   
    // freopen("div7.in", "r", stdin); 
    // freopen("div7.out", "w", stdout);
    cin.tie(0);
    cout.tie(0);
    ios_base::sync_with_stdio(0);
    solve();
    return 0;
}