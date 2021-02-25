public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int x=0;
        int y=0;
        while(x<d){
            y=a[0];
            for(int i=1;i<a.length;i++){
                a[i-1]=a[i];
            }
            a[a.length-1]=y;
            x++;
            
        }
return a;
    }
