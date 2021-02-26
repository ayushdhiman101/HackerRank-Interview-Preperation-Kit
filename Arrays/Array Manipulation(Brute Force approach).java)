 static long arrayManipulation(int n, int[][] queries) {
    long [] arr = new long[n];

    
    long nosRows = queries.length;
    
    for(int i=0;i<nosRows;i++){ 
        int a=queries[i][0];
        int b=queries[i][1];
        int c=queries[i][2];
        
        for(int j=a-1;j<=b-1;j++){
            arr[j]=arr[j]+c;
        }
    }
    
    long max=arr[0];
    for(int i=1;i<n;i++){
    if(arr[i]>max)
    max=arr[i];
    } 

        
        

 return max;
    }
