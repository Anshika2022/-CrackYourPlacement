class Solution {
  public:
     void permutation(int i, int n, vector<int> p, vector<vector<int>> & ans, vector<int> arr, bool v[])
     {
        // code here
         if(i==n){
            ans.push_back(p);
            return;
        }
        
        int j;
        
        for(j=0; j<n; j++)
        {
            if(v[j]==false)
            {
                if(j>0){
                    if(arr[j]!=arr[j-1] || v[j-1]==true){
                        p.push_back(arr[j]);
                        v[j]=true;
                        permutation(i+1, n, p, ans, arr, v);
                        v[j]=false;
                        p.pop_back();
                    }
                }else{
                    p.push_back(arr[j]);
                    v[j]=true;
                    permutation(i+1, n, p, ans, arr, v);
                    v[j]=false;
                    p.pop_back();
                }
                
            }
        }
    }
    vector<vector<int>> uniquePerms(vector<int> &arr ,int n) {
        // code here
        vector<vector<int>> ans;
        
        vector<int> p;
        
        bool v[n];
        
        for(int i=0; i<n; i++){
            v[i]=false;
        }
        
        sort(arr.begin(), arr.end());
        
        permutation(0, n, p, ans, arr, v);
        
        return ans;
    }
};
