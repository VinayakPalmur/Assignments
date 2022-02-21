#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {
      int t; cin>>t; while(t--){
	    string s; cin>>s;
	    int i=0,j=0,len=0;
	    unordered_set<char> m;
	  //  for(auto k : s) m.insert(k);
	    while(i<s.size() && j<s.size()){
	        if(m.find(s[j]) == m.end()){
	            m.insert(s[j++]);
	            len = max(len, j-i);
	        }
	        else m.erase(s[i++]);
	    }
	    cout<<len<<'\n';
	}
	return 0;
}
