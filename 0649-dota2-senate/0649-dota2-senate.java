class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> sen=new LinkedList<>();
        int D=0,R=0;
        for(int i=0;i<senate.length();i++){
            char p=senate.charAt(i);
            sen.add(p);
            if(p=='R'){
                R++;
            }
            else{
                D++;
            }
        }
        int dr=0;
        int rr=0;
        while(R>0 && D>0){
            char ch=sen.remove();
            if(ch=='D'){
                if(dr==0){
                    rr++;
                    sen.add(ch);
                }
                else{
                    dr--;
                    D--;
                }
                
            }
            else{
                if(rr==0){
                    dr++;
                    sen.add(ch);
                }
                else{
                    rr--;
                    R--;
                }
            }
    }
    if(R>0){
        return "Radiant";
    }
    else{
        return "Dire";
    }
}}