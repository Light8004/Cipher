
import java.lang.Math;

class cipher extends RSA{

    Boolean prev;
    Boolean mod; 
    int lvl; 
    static String roxy; 
    static String raptor; 
    int prot; 

            cipher(boolean a, boolean b, int c, int d){
                a = prev; 
                b = mod; 
                c = lvl; 
                d = prot; 
            }    


            static String cryptabool(Boolean free, int imp){
                        roxy = ""; 
                    if(imp<5){
                            if(free = true){
                                for(int i = 0; i<=imp; i++){
                                    if(i%2==1){
                                        raptor = roxy + "1";
                                    }
                                
                                    else{
                                        raptor = roxy + "0";

                                    }       

                                }  
                            }
                    }


            return raptor ;
            }
            
    static boolean decryptabool(String str){
            //do math if true
           boolean dc = true; 
    return dc;  
    }

    
    public int cryptint(int a){
        int rint; 
        a = math.pow(a,100)
        for(int i = 0; i<a; i++){
        rint = a*i; 
        rint = rint + (math.pow(a,100))
        rint = rint - 1; 
        }


        return rint; 
    }
    

    public int decryptint(int a){
        int rint; 
        a = a-1;
        a = a - (math.pow(a, 1/100))
        

    }

    public String excessiveCryptStr(String str){
            String rstr; 
            str = str.toLowerCase(); 

            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i).equals("a")){
                    rstr += "b"
                }
                if(str.charAt(i).equals("b")){
                    rstr += "c"
                }
                if(str.charAt(i).equals("c")){
                    rstr += "d"
                }
                if(str.charAt(i).equals("d")){
                    rstr += "e"
                }
                if(str.charAt(i).equals("e")){
                    rstr += "f"
                }
                if(str.charAt(i).equals("f")){
                    rstr += "g"
                }
                if(str.charAt(i).equals("g")){
                    rstr += "h"
                }if(str.charAt(i).equals("h")){
                    rstr += "i"
                }if(str.charAt(i).equals("i")){
                    rstr += "j"
                }if(str.charAt(i).equals("j")){
                    rstr += "k"
                }if(str.charAt(i).equals("k")){
                    rstr += "l"
                }if(str.charAt(i).equals("l")){
                    rstr += "m"
                }if(str.charAt(i).equals("m")){
                    rstr += "n"
                }if(str.charAt(i).equals("n")){
                    rstr += "o"
                }if(str.charAt(i).equals("o")){
                    rstr += "p"
                }if(str.charAt(i).equals("p")){
                    rstr += "q"
                }if(str.charAt(i).equals("q")){
                    rstr += "r"
                }if(str.charAt(i).equals("r")){
                    rstr += "s"
                }if(str.charAt(i).equals("s")){
                    rstr += "t"
                }if(str.charAt(i).equals("t")){
                    rstr += "u"
                }if(str.charAt(i).equals("u")){
                    rstr += "v"
                }if(str.charAt(i).equals("v")){
                    rstr += "w"
                }if(str.charAt(i).equals("w")){
                    rstr += "x"
                }if(str.charAt(i).equals("x")){
                    rstr += "y"
                }if(str.charAt(i).equals("y")){
                    rstr += "z"
                }
                if(str.charAt(i).equals("z")){
                    rstr += "a"
                }



            }
            for(int i = 0; i<str.length; i++){
                if(i%2 == 1){
                    rstr.charAt(i).toUpperCase();
                }
            }

        return rstr; 
    }
    public static void main(String[] args)  {

            System.out.println("hw");
            System.out.println(cryptabool(true,11));
            
            
    }


}       
