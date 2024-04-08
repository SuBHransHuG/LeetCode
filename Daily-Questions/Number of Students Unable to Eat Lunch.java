class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         int[] count = new int[2];
        for (int student : students) {
            count[student]++;
        }
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                return count[sandwich ^ 1];
            }
            count[sandwich]--;
        }
        return 0;
    }
}
