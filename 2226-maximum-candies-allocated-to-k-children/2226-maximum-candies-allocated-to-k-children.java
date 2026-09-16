class Solution {
    boolean isvalid(int[] candies,long mid,long k) {
        long c=0;
        for(int i=0;i<candies.length;i++) {
            c=c+(candies[i]/mid);
        }
        return c>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        long poss=0;
        for(int i=0;i<candies.length;i++) {
            poss=poss+candies[i];
        }
        poss=poss/k;
        long s=1;
        long e=poss;
        long ans=0;
        while(s<=e){
            long mid=(s+e)/2;
            if (isvalid(candies,mid,k)) {
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return (int)ans;
    }
}