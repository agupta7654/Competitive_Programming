#include <iostream>
#include <vector>
#include <string>
#include <cmath> 

using namespace std;


int main()
{
    // freopen("billboard.in", "r", stdin); 
    // freopen("billboard.out", "w", stdout);

    int t;
    cin >> t;
    while(t--){
        long long n;
        cin >> n;
        long long realNum = n;
        long long cnt = 0;
        while(n > 0){
            n = n / 10;
            cnt++;
        }
        long long numToCountTo = 1 * pow(10, cnt);
        long long maxNum = numToCountTo/2 - 1;
        long long count = 0;
        long long mult = 0;
        while(cnt--){
            if(cnt == 0){
                mult = mult*10 + 1;
                numToCountTo -= 5*mult;
            }
            else{
                count += 5*mult;
            }
            mult = mult*10 + 1;
        }    
        // cout << maxNum << " " << numToCountTo << endl;
        if(realNum >= numToCountTo){
            if(realNum > maxNum){
                count += maxNum-numToCountTo+1;
            }
            else{
                count += realNum-numToCountTo+1;
            }
        }
        cout << count << endl;
    }
   
}