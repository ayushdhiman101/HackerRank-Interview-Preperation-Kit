public static int countingValleys(int steps, String path) {
    
     int d=0,u=0,count=0,g=0;
        for(int i=0;i<path.length();i++){
            String b=Character.toString(path.charAt(i));
                        
            
            if(b.equals("D"))
              d++;
            if(b.equals("U"))
              u++;
            
        if(!b.equals("D")){
            if(d==u){
             count++;
             d=0;u=0;
             g++;
            }
        
            }
                
        }
    
return g;

    }
}
