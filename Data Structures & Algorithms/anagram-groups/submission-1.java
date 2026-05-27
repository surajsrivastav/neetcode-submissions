class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramHash = new HashMap();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String shortedStr = new String(chars);
            if(anagramHash.containsKey(shortedStr)){
                anagramHash.get(shortedStr).add(str);
            }else{
                List<String> group = new ArrayList();
                group.add(str);
                anagramHash.put(shortedStr, group);
            }
        }
        return new ArrayList(anagramHash.values());
    }
}