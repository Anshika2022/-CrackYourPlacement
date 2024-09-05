class Solution {
    public int mctFromLeafValues(int[] arr) {
        int n=arr.length;
        return fun(arr,0,n-1).sum;
    }
    public pair fun(int arr[],int l,int r){
        if(l>r)
            return new pair(0,1000000);
        if(l==r)
            return new pair(arr[l],0);
        pair ans=new pair(0,1000000);
        for(int i=l;i<r;i++){
            pair p_left=fun(arr,l,i);
            pair p_right=fun(arr,i+1,r);
            int total=p_left.max*p_right.max+p_left.sum+p_right.sum;
            if(total<ans.sum)
            {
                ans.max=Math.max(p_left.max,p_right.max);
                ans.sum=total;
            }
        }
        return ans;
    }
    class pair{
        int max;
        int sum;
        pair(int max,int sum){
            this.max=max;
            this.sum=sum;
        }
    }
}
