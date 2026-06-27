class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();


        for(String s: strs){
            encoded_string.append(s.length()).append("#").append(s);
        }
    
        return encoded_string.toString();

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        
        int i = 0;
        while(i < str.length()){

            int j = i;
            while(!(str.charAt(j) == '#')){
                j++;
            }

            int wordLen = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j+1, j+1+wordLen);
            res.add(word);

            i = j + 1 + wordLen;
        }

        return res;
        
       



    }
}
