class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m == num / m && num % m == 0)
                return true;

            if (m < num / m)
                s = m + 1;
            else
                e = m - 1;
        }

        return false;
    }
}