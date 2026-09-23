class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int p=st.peek()*2;
                st.push(p);
            }
            else if(operations[i].equals("+")){
                int f=st.pop();
                int s=st.pop();
                int sum=f+s;
                st.push(s);
                st.push(f);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sumx=0;
         while(!st.isEmpty()){
            sumx+=st.pop();
        }
        return sumx;
    }
}