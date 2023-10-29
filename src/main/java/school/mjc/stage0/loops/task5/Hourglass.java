package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int check = height%2==0? height/2:height/2+1;
        int first = height%2==0?2:1;
        for(int i = check; i >= 1; i--){
            for(int empty = 1; empty<=check-i; empty++){
                System.out.print(" ");
            }
            for(int x= first+(i-1)*2; x >= 1 ; x-- ){
                System.out.print("8");
            }
            for(int empty = 1; empty<=check-i; empty++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i<=height-check; i++){
            for( int empty = height-check-i; empty>=1; empty--){
                System.out.print(" ");
            }
            for(int x = height-check==check? first + (i-1)*2 : (first +2) + (i-1)*2 ; x >= 1 ; x--){
                System.out.print("8");
            }
            for( int empty = height-check-i; empty>=1; empty--){
                System.out.print(" ");
            }
            System.out.println() ;
        }
    }
}

