
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
                char ab = str.charAt(i);
                if(ab=='a'){
                    rstr += "b";
                }
                if(ab=='b'){
                    rstr += "c";
                }
                if(ab=='a')){
                    rstr += "d";
                }
                if(ab=='d')){
                    rstr += "e";
                }
                if(ab=='e'){
                    rstr += "f";
                }
                if(ab=='f'){
                    rstr += "g";
                }
                if(ab=='g'){
                    rstr += "h";
                }if(ab=='h'){
                    rstr += "i";
                }if(ab=='i'){
                    rstr += "j";
                }if(ab=='j'){
                    rstr += "k";
                }if(ab=='k'){
                    rstr += "l";
                }if(ab=='l'){
                    rstr += "m";
                }if(ab=='m'){
                    rstr += "n";
                }if(ab=='n'){
                    rstr += "o";
                }if(ab=='o'){
                    rstr += "p";
                }if(ab=='p'){
                    rstr += "q";
                }if(ab=='q'){
                    rstr += "r";
                }if(ab=='r'){
                    rstr += "s";
                }if(ab=='s'){
                    rstr += "t";
                }if(ab=='t'){
                    rstr += "u";
                }if(ab=='u'){
                    rstr += "v";
                }if(ab=='v'){
                    rstr += "w";
                }if(ab=='w'){
                    rstr += "x";
                }if(ab=='x'){
                    rstr += "y";
                }if(ab=='y'){
                    rstr += "z";
                }
                if(ab=='z'){
                    rstr += "a";
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
