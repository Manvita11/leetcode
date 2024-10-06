class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] larger = sentence1.split(" ");
        String[] smaller= sentence2.split(" ");

        if(smaller.length == larger.length){
            return sentence1.equals(sentence2);
        }

        if(smaller.length > larger.length){
            String[] temp= larger;
            larger= smaller;
            smaller= temp;
        }

        int start=0;
        while(start<smaller.length && smaller[start].equals(larger[start])){
            start++;
        }

        int idx = larger.length-1;
        for(int end = smaller.length-1; end >= start; end--, idx--){
            if(!smaller[end].equals(larger[idx])){
                return false;
            }
        }
        return true;
    }
}