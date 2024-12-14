#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
   int n;
   cin >> n;
   while(n--){
    int x;
    cin >> x;
    int ma = 0;
    int mx = -1;
    for(int i = 2; i <= x; i++){
        int curCount = 0;
        int m = 1;
        while(m * i <= x){
            curCount += m*i;
            m++;
        }
        if(curCount > ma){
            ma = curCount;
            mx = i;
        }
    }
       cout << mx << endl;
   }
}