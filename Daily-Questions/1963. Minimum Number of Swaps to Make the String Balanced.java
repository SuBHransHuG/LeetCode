class Solution {
    public int minSwaps(String s) {
        char[] arr = s.toCharArray();
        int a = 0;
        int b =0;
        // if(s.length()<3){
        //     return 0;
        // }
        for(char ch: arr){
            if(ch == '['){
                a++;
            }
            else{
                if(a<=0){
                    b++;
                }
                else{
                    a--;
                }
            }
        }
        return (b+1)/2;

    }
}
