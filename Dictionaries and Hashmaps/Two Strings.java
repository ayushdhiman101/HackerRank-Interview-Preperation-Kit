static String twoStrings(String s1, String s2) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++)
        {
            if(hm.containsKey(s1.charAt(i))){
                int x=hm.get(s1.charAt(i));
                hm.put(s1.charAt(i),x+1);
            }
            else
            hm.put(s1.charAt(i),1);
        
        }
        
        for (int i = 0; i < s2.length(); i++)
        {
            if(hm.containsKey(s2.charAt(i)))
            return "YES";
                  
        }

return "NO";    }
