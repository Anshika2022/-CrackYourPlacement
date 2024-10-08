class NumArray {

    int[] tree;
    int[] nums;
    int size;
    public NumArray(int[] nums) {
        this.size=nums.length;
        this.tree = new int[size+1];
        this.nums=new int[size];
        this.nums=nums;
        
        for(int i=0;i<size;i++)
        {
            updateTree(i,nums[i]);
        }
        
    }
    
    public void updateTree(int i,int val)
    {
        i=i+1;
        while(i<=size)
        {
           tree[i]+=val; 
            i+=i&(-i);
        }
        
    }
    
    public void update(int index, int val) {
        updateTree(index,val-nums[index]);
        nums[index]=val;
    }
    
    private int getSum(int i)
    {
     int sum=0;
        i=i+1;
        while(i>0)
        {
            sum+=tree[i];
            i-=i&(-i);
        }
        return sum;
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return getSum(right);
        return getSum(right)-getSum(left-1);

        
    }
}
