class Solution {
    public boolean isUgly(int n) {
        // // if(n==1){
        // //     return true;
        // // }
        // //  if(n%2==0 || n%3==0 || n%5==0){
        // //         return true;
        // // }
        // // return false;
        // if(n==1){
        //     return true;
        // }
        // // ArrayList<Integer> al = new ArrayList<Integer>();
        // for(int i=2;i<Math.sqrt(n);i++){
        //      if(n%2==0 || n%3==0 || n%5==0){
        //         if(n%i<=5){
        //         return true;
        //         }
        //  }
        //  }
        //     // al.add(t);
        // // for(int i=0;i<al.size();i++)
        // // {
        // //      if(al.get(i)%2==0 || al.get(i)%3==0 || al.get(i)%5==0){
        // //          return true;
        // //  }
        // // }
        // return false;
        if(n<=0){
            return false;
        }
        while(n%2==0){n/=2;}
        while(n%3==0){n/=3;}
        while(n%5==0){n/=5;}
        return (n==1);
    }
}
