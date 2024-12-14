#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
   int t;
   cin  >> t; 
   while(t--){
    int n;
    cin >> n;
    int rating = 0;
    int score;
    vector<int> skip;
    for(int i = 0; i < n; i++){
        cin >> score;
        if(score > rating){
            rating++;
        }
        else{
            skip.push_back(i);
        }
    }
    int curLen = 0;
    for(int i  = 0; i < skip.size(); i++){
        
    }
    cout << endl;
   }
}