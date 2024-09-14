class Solution {
    public String convertToBase7(int num) {
        char[] def = {'0', '1', '2', '3', '4', '5', '6'};
        int r = 0;
        String res = "";
        String result = "";


        if(num == 0){
            return "0";
        }
        else if(num > 0){
            while(num > 0){
                r = num%7;
                res = def[r]+res;
                num = num/7;
            }
        }
        else{
            num = Math.abs(num);
            while(num > 0){
                r = num%7;
                result = def[r]+result;
                num = num/7;
            }
            res = "-"+result;

        }

        return res;
    }
}
