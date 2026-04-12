class Solution {
    public boolean isValid(String s) {
               Stack<Character> answer = new Stack<>();  // Character, not String
                       for (int i = 0; i < s.length(); i++){
                                   if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                                                   answer.push(s.charAt(i));
                                                               }
                                                                           else {
                                                                                           if(answer.empty()){
                                                                                                               return false;
                                                                                                                               }
                                                                                                                                               else {
                                                                                                                                                                   char temp = answer.pop();
                                                                                                                                                                                       if ((temp == '(' && s.charAt(i) == ')') || (temp == '[' && s.charAt(i) == ']') || (temp == '{' && s.charAt(i) == '}')){
                                                                                                                                                                                                               continue;
                                                                                                                                                                                                                                   }
                                                                                                                                                                                                                                                       else {
                                                                                                                                                                                                                                                                               return false;
                                                                                                                                                                                                                                                                                                   }
                                                                                                                                                                                                                                                                                                                   }
                                                                                                                                                                                                                                                                                                                               }
                                                                                                                                                                                                                                                                                                                                       }
                                                                                                                                                                                                                                                                                                                                               return answer.empty();  // true if all brackets were matched
    }
}
