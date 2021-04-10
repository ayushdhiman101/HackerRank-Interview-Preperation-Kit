static int minimumSwaps(int[] arr) {
           int temp=0,count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((arr[j]==i+1&&i!=j)){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    
                    count++;
                }

        }

        }
        return count;
    }
