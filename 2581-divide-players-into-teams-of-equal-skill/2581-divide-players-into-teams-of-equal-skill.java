class Solution {
    public long dividePlayers(int[] skill) {
        long total = 0;
        int n = skill.length;
        Arrays.sort(skill);

   
        long target = skill[0] + skill[n - 1];

        int i = 0, j = n - 1;
        while(i < j){
            if(skill[i] + skill[j] != target){
                return -1;
            }
            else{
      
                total += skill[i] * skill[j];
            }
            i++; j--;
        }
        return total;
    }
}