
import java.util.Scanner;

public class RandomWalkDriver {
    public static void main(String[] args){
       
        
        RandomWalk randomWalk;
    
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Java RandomWalkDriver");

		System.out.print("Enter Gridsize: ");
		int gridSize = scan.nextInt();
        
		while (gridSize <= 0){
            System.out.println("Error: Gridsize must be positive!");
            
            System.out.print("Enter Gridsize: ");
		    gridSize = scan.nextInt();
            
        }


		System.out.print("Enter random seed (0 for no seed): ");
        int seed = scan.nextInt();

        while(seed < 0 ){
            System.out.println("Error: random seed must be >= 0!");
            
            System.out.print("Enter random seed (0 for no seed): ");
            seed = scan.nextInt();
        }

        if (seed == 0){
            randomWalk = new RandomWalk(gridSize);

        }else{
            randomWalk = new RandomWalk(gridSize, seed);
        }


        
        randomWalk.createWalk();

        System.out.println(randomWalk.toString());

        scan.close();
	}

}
       
     