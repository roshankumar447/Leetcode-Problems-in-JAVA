class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap= new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for(i=0;i<stones.length;i++){
            heap.add(stones[i]);
        }
        int m1,m2;
        while(heap.size()>1){
            m1=heap.remove();
            m2=heap.remove();
            if(m1!=m2){
                heap.add(m1-m2);
            }
        }
        if(heap.isEmpty()) return 0;
        else{
            return heap.remove();
        }
    }
}