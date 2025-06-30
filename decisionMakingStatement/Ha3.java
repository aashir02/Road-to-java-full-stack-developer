public class Ha3 {
    public static void main(String[] args) {
        String vowels="aeiouAEIOU";
        char t = 'A';
        int flag=0;
        for (int i = 0; i < vowels.length(); i++) {
            if(t==vowels.charAt(i)){
                System.out.println(t+" is a vowel ");
                flag=1;
                break;
            }
        }
        if(flag!=1){
            if((int)t>97 & (int)t<122 || (int)t>65 & (int)t<89){
                    System.out.println(t+" is a consonant");
                    
                }
                else{
                    System.out.println(t+" is not an alphabet");
                }

        }
        
       
    }
}