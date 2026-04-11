class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                List<List<String>> answer = new ArrayList<List<String>>();
                        HashMap<String,Integer> data = new HashMap<>();
                                for (int i = 0; i < strs.length; i++){
                                            int [] letters = new int[26];
                                                        for (int j = 0; j < strs[i].length(); j++){
                                                                        letters[((int) strs[i].charAt(j))-97] +=1;
                                                                                    }
                                                                                                if (data.containsKey(Arrays.toString(letters))){
                                                                                                                answer.get(data.get(Arrays.toString(letters))).add(strs[i]);
                                                                                                                            }
                                                                                                                                        else {
                                                                                                                                                        List<String> temp = new ArrayList<String>();
                                                                                                                                                                        temp.add(strs[i]);

                                                                                                                                                                                                        answer.add(temp);
                                                                                                                                                                                                                        data.put(Arrays.toString(letters), answer.size() - 1); //            
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                System.out.println(Arrays.toString(letters) + "++++++++\n\n\n");
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                System.out.println("+++" + answer);
                                                                                                                                                                                                                                                                        return answer; 
    }
}
