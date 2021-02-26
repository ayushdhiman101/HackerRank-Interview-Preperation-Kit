 static long arrayManipulation(int n, int[][] queries) {
    long [] arr = new long[n];

    
    long nosRows = queries.length;
    
    for(int i=0;i<nosRows;i++){ 
        int a=queries[i][0];
        int b=queries[i][1];
        int c=queries[i][2];
        
        arr[a-1]+=c;
        if(b<n)
        arr[b]-=c;
    }
    
    long sum=0;
    long max=arr[0];
    for(int i=1;i<n;i++){
        arr[i]+=arr[i-1];
        max=Math.max(max,arr[i]);
    } 
    
 return max;
    }
