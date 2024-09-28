class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=findmax(weights);
        int high=sumofele(weights);
        int res=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(check(weights,mid,days))
            {
                res=Math.min(mid,res);
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
    public boolean check(int weights[],int mid,int days)
    {
        int reqdays=1,load=0;
        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>mid)
            {
                reqdays++;
                load=weights[i];
            }
            else
            {
                load+=weights[i];
            }
        }
        if(reqdays<=days)
            return true;
        return false;
    }
    public int findmax(int weights[])
    {
        int maxi=weights[0];
        for(int i=0;i<weights.length;i++)
        {
            maxi=Math.max(maxi,weights[i]);
        }
        return maxi;
    }
    public int sumofele(int weights[])
    {
        int sumofele=0;
        for(int ele:weights)
            sumofele+=ele;
        return sumofele;
    }
}