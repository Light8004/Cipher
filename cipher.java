class cipher{

    Boolean prev;
    Boolean mod; 

    int lvl; 
    static String roxy; 
    static String raptor; 

            cipher(boolean a, boolean b, int c){

                a = prev; 
                b = mod; 
                c = lvl; 

            }    


            static String cryptbool(Boolean free, int imp){
                        
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
                       
                    
                        
                        if(imp>5 && imp>10){


                        }
                        
                        if(imp>=10){
                        imp = imp^9; 
                        
                        for(int i = 0; i<imp; i++){
                            
                            raptor = raptor + "0";
 
                                
                        
                           
                            
                        }
                    }



                       return raptor ;
                    }
            


                    

    static boolean decryptbool(String str){
           boolean dc; 
           
    
            return dc; 
        
        
    }
    

    public static void main(String[] args)  {

            System.out.println("hw");
            System.out.println(cryptbool(true,11));
            
            
    }





}       
