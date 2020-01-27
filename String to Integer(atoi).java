class Solution {
    public int myAtoi(String str) {
        char[] charlist = str.toCharArray();
        int length = str.length();
        int i = 0;
        int flag = 1;
        int pop = 0;
        int num = 0;
        for(;i < length;i++ ){
            if (charlist[i] == ' '){
                continue;
            }
            else{
                if(charlist[i] == '-'){
                    flag = -1;
                    i++;
                    break;
                }
                if(charlist[i] == '+'){
                    i++;
                    break;
                }
                if(charlist[i] < '0' || charlist[i] > '9'){
                    return 0;
                }
                else{
                    break;
                }

            }
        }
        for(;i < length; i++){
            if(charlist[i] < '0' || charlist[i] > '9'){
                break;
            }
            pop = charlist[i] - '0';
            pop *= flag;
            if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && pop > 7)){
                return Integer.MAX_VALUE;
            }
            if(num < Integer.MIN_VALUE/10 || (num ==Integer.MIN_VALUE/10 && pop < -8)){
                return Integer.MIN_VALUE;
            }
            num =num*10 + pop;
        }
        return num;
        
    }
}