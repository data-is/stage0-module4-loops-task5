package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for(int i =0; i<sideLength; i++){
            if(i==0 || i==sideLength-1){
                for(int o=0; o<sideLength; o++){
                    System.out.print("8");
                }
                System.out.print("\n");
            }
            else{

                for(int x=0; x<sideLength; x++){
                    if(x==0 || x==sideLength-1){
                        System.out.print("8");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.print("\n");

            }


        }

    }
}