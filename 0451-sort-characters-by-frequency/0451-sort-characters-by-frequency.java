class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        StringBuilder sb=new StringBuilder();
        int arr[]=new int[map.size()];
        int k=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
                arr[k]=e.getValue();
                k++;
        }

        Arrays.sort(arr);

        for(int i=arr.length-1;i>=0;i--){

            int num=arr[i];
            char rem=' ';
            for(Map.Entry<Character,Integer> e:map.entrySet()){
                if(e.getValue()==num){
                    for(int j=0;j<num;j++){
                        sb.append(e.getKey());
                        rem=e.getKey();
                    }
                    break;
                }
            }
            map.remove(rem);
        }

        return sb.toString();
    }
}