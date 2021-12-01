
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
    public static void main(String[] args)  {

            System.out.println("hw");
            System.out.println(cryptabool(true,11));
            
            
    }


}       
