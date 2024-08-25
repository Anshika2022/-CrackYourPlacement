class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String,List<String>> anagramWordsMap = new HashMap<>();
        for(int i = 0; i<string_list.length; i++){
            char[] tmp = string_list[i].toCharArray();
            Arrays.sort(tmp);
            String tempString = new String(tmp);
            if(anagramWordsMap.containsKey(tempString)){
                List<String> anagrams = anagramWordsMap.get(tempString);
                anagrams.add(string_list[i]);
                anagramWordsMap.put(tempString,anagrams);
            }else{
                List<String> anagrams = new ArrayList<>();
                anagrams.add(string_list[i]);
                anagramWordsMap.put(tempString,anagrams);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String s : anagramWordsMap.keySet()){
            result.add(anagramWordsMap.get(s));
        }
        return result;
    }
}
