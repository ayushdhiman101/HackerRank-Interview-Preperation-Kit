    public static void main(String[] args) {
        
        int size=arr.length;
        int x=0;
        int p=0;
        int j=1;
        int sum=0;
        int[][] fin=new int [arr.length-2][arr.length-2];
        
        //adding all the top3 3 and bottom 3 element
        //will add the center element later
        
        while(x<arr.length-2 && p<arr.length-2){
            for(int i=x;i<x+3;i++){
                sum+=arr[p][i];
                sum+=arr[p+2][i];              
             }
            
            
        fin[p][x]=sum;
        sum=0;
        x++;
            
        if(x==arr.length-2){
        p++;
        x=0;
        }
      }
      
      //making a new array from center elements of arr
        int fin2[][]=new int[fin.length][fin.length];

        for (int h = 1; h < arr.length-1; h++)
             for (int k = 1; k < arr.length-1; k++)
                 fin2[h-1][k-1]=arr[h][k];              
         //adding these values to their respective elements                   
         for (int h = 0; h < fin.length; h++)
             for (int k = 0; k < fin.length; k++)
                 fin[h][k]+=fin2[h][k];
              
              
        int max=fin[0][0];
        for (int h = 0; h < fin.length; h++){
             for (int k = 0; k < fin.length; k++){
                 if(fin[h][k]>max)
                     max=fin[h][k];
              
                }          
        }
   
    }
}
    

