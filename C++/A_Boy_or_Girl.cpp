#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
   string s;
   cin >> s;

    string used = "";
    int cnt = 0;

   for (int i = 0; i < s.size(); i++)  {
     if(used.find(s[i]) == string::npos) {
        cnt++;
        used += s[i];
     }
     
   }
   if(cnt % 2 == 0) {
      cout << "CHAT WITH HER!";
   } else {
      cout << "IGNORE HIM!";
   }
}