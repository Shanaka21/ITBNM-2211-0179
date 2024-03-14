public class Inky{



    public static void main(String[] args){
    
    String pinky = "donkey";   
    String blinky ="Pinky";
    String rinky = "monkey";
    
    Inky ponky = new Inky(pinky);
    
    Inky ponky2 = new Inky(pinky, blinky, rinky);
    
    }
    
    public Inky(String a){
    
    System.out.println(a);
    
    }
    
    public Inky(String a, String b, String c){
    
    System.out.println(b +" "+a);
    System.out.println(a +" "+c);
    System.out.println(b +" "+a+" "+c);
    
    }
    
    }