static void minimumBribes(int[] q) {
        int p1=1;
        int p2=2;
        int p3=3;
        int count=0;
        
        
        for(int i=0;i<q.length;i++){
            
            if(q[i]==p1){
                p1=p2;
                p2=p3;
                p3++;
            }
             else if(q[i]==p2){
                p2=p3;
                p3++;
                count++;
            }
             else if(q[i]==p3){
                p3++;
                count+=2;
            }
             else{
               System.out.println("Too chaotic");
               return;
            }
        }


        System.out.println(count);



    }
