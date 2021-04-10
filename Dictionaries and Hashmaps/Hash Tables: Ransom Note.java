static void checkMagazine(String[] magazine, String[] note) {
        

        HashMap<String, Integer> hm= new HashMap<String, Integer>();
        for(int i=magazine.length-1;i>=0;i--){
            if(hm.containsKey(magazine[i])){
                hm.put(magazine[i], hm.get(magazine[i])+1);
            }else{
                hm.put(magazine[i],1);
            }
        }

       for(int i=note.length-1;i>=0;i--){
            if(hm.containsKey(note[i])){
                hm.put(note[i], hm.get(note[i]) - 1);
                    if(hm.get(note[i]) < 0){
                    System.out.println("No");
                    return;
                 }
            }else{
                System.out.println("No");
                    return;
            }
        
        System.out.println("Yes");
        
}
