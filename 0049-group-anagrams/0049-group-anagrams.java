class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String word:strs)
        {
            char[] s=word.toCharArray();
            Arrays.sort(s);
            String key=new String(s);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}