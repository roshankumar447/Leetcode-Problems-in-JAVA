import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        for (int i=0;i<students.length;i++) {
            stu.add(students[i]);
        }
        int i=0;
        int c=0;
        while (!stu.isEmpty() && c<stu.size()) {
            if (stu.peek() == sandwiches[i]) {
                stu.remove();
                i++;
                c=0;
            } 
            else {
                stu.add(stu.remove());
                c++;
            }
        }
        return stu.size();
    }
}