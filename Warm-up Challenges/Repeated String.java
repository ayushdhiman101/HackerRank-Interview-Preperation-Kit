static long repeatedString(String s, long n) {
        long count=0,fin=0;
      
        int i=0;
        
        while(i<s.length()){
            String x=s.valueOf(s.charAt(i));
            if(x.equals("a"))
            count++; 
            i++;             
        }
        
        long complete = n / s.length();   
        long incomplete = n % s.length();
        
        fin=count*complete;
        count=0;
        
    for(int j=0;j<incomplete;j++){
        String x=s.valueOf(s.charAt(j));
            if(x.equals("a"))
            count++; 
                
    }
        
fin+=count;

return fin;
    }
