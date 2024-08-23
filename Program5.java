//import stuff here?
public class Program5 {
    public static void main(String[] args){
    //Declare var
    int royalMiles = 286;
    int royalGel = 9;
    double royaleAvg = 0.0;
    int koopaKingMiles = 412;
    int koopaKingGel = 40;
    double koopaKingAvg = 0.0;
    int pipeFrameMiles = 361;
    int pipeFrameGel = 18;
    double pipeFrameAvg = 0.0;
    int bandwagonMiles = 161;
    int bandwagonGel = 11;
    double bandwagonAvg = 0.0;
    
    //calc
    royaleAvg = (double) royalMiles/royalGel;
    koopaKingAvg = (double) koopaKingMiles/koopaKingGel;
    pipeFrameAvg = (double) pipeFrameMiles/pipeFrameGel; 
    bandwagonAvg = (double) bandwagonMiles/bandwagonGel;
    
    //decimals gone
    royaleAvg = ((int)((royaleAvg*10)+0.5))/10.0;
    koopaKingAvg = ((int)((koopaKingAvg*10)+0.5))/10.0;
    pipeFrameAvg = ((int)((pipeFrameAvg*10)+0.5))/10.0;
    bandwagonAvg = ((int)((bandwagonAvg*10)+0.5))/10.0;
    
    //print results
    System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: /n");
    System.out.println("Royale averaged " + royaleAvg + " m/g /n");
    System.out.println("Koopa King averaged " + koopaKingAvg + " m/g");
    System.out.println("Pipe Frame averaged " + pipeFrameAvg + " m/g");
    System.out.println("Badwagon averaged " + bandwagonAvg + " m/g");
    
    };
    
}
//Your code here

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon: /n
Royale averaged 31.8 m/g /n
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Badwagon averaged 14.6 m/g

*/
