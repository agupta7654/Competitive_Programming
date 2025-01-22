#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>


using namespace std;


int main()
{
    int n;
    cin >> n;
    vector<string> dir;
    vector<pair<long long,long long>> main;
    vector<long long> fin;
    vector<bool> done;
    long long distTraveled = 0;

    for(int i = 0; i < n; i++){
        string s;
        long long x,y;
        cin >> s;
        cin >> x >> y;
        dir.push_back(s);
        main.emplace_back(x,y);
        fin.push_back(-1);
        done.push_back(false);
    }
    bool hasHit = true;
    while(hasHit == true){
        long long closestHit = 1000000000;
        bool hit = false;
        int hitIndex = -1;
        for(int i = 0; i < main.size(); i++){
            if(done[i] == false){
                long long x = main[i].first;
                long long y = main[i].second;
                string d = dir[i];
                for(int j = 0; j < main.size(); j++){
                    if(i != j){
                        if(done[j] == true){
                            if(d == "E" && dir[j] == "N"){
                                if(y <= main[j].second && x < main[j].first){
                                    if(closestHit >= main[j].first-x){
                                        closestHit = main[j].first-x;
                                        hit = true;
                                        hitIndex = i;
                                    }
                                    cout << i << " " << j << " " << main[j].first-x << endl;
                                }
                            }
                            else if(d == "N" && dir[j] == "E"){
                                if(x <= main[j].first && y < main[j].second){
                                    if(closestHit >= main[j].second-y){
                                        closestHit = main[j].second-y;
                                        hit = true;
                                        hitIndex = i;
                                    }
                                    cout << i << " " << j << " " << main[j].second-y << endl;
                                }
                            }
                        }
                        else{
                            if(d == "E" && dir[j] == "N"){
                                if(x < main[j].first && y >= main[j].second && y <= main[j].second+main[j].first-x ){
                                    if(main[j].first-x != y-main[j].second){
                                        if(closestHit >= main[j].first-x){
                                            closestHit = main[j].first-x;
                                            hit = true;
                                            hitIndex = i;
                                        }
                                        cout << i << " " << j << " " << main[j].first-x << endl;
                                    }
                                }
                            }
                            else if(d == "N" && dir[j] == "E"){
                                if(y < main[j].second && x >= main[j].first && x <= main[j].first+main[j].second-y){
                                    if(main[j].second-y != x-main[j].first){
                                        if(closestHit >= main[j].second-y){
                                            closestHit = main[j].second-y;
                                            hit = true;
                                            hitIndex = i;
                                        }
                                        cout << i << " " << j << " " << main[j].second-y << endl;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hasHit = hit;
        distTraveled += closestHit;
        if(hit){
            fin[hitIndex] = closestHit;
            if(dir[hitIndex] == "E"){
                main[hitIndex] = make_pair(main[hitIndex].first+distTraveled, main[hitIndex].second);

            }
            else if(dir[hitIndex] == "N"){
                main[hitIndex] = make_pair(main[hitIndex].first, main[hitIndex].second+distTraveled);
            }
            done[hitIndex] = true;    
        }
        cout << endl;
        for(auto i : main){
            cout << i.first << " " << i.second << endl;
        }
        cout << endl;
    }

    for(auto i : fin){
        cout << i << endl;
    }

    
}