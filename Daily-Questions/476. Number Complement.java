class Solution {
    public int findComplement(int num) {
       String s =  Integer.toBinaryString(num);
       char[] arr = s.toCharArray();
       for(int i=0;i<arr.length;i++){
        if(arr[i]=='1'){
            arr[i]='0';
        }
        else{
            arr[i]='1';
        }
       }
       String str = new String(arr);
       int integerValue = Integer.parseInt(str, 2);
       return integerValue;
    }
}
