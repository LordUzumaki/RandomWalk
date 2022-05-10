import java.awt.Point;
import java.util.ArrayList;

import java.util.Random;


import edu.cwi.randomwalk.RandomWalkInterface;

public class RandomWalk implements RandomWalkInterface{
    private int gridSize;
    private boolean done;
    private Point start;
    private Point end;
    private Point current;
    private Random gen;
    private ArrayList<Point> path;
    
   

    public RandomWalk(int gridSize){
        this.gridSize = gridSize;
        this.done = false;
        this.start = new Point(0, gridSize - 1);
        this.end = new Point(gridSize - 1, 0);
        this.current = this.start;
        this.gen = new Random();
        this.path = new ArrayList<Point>();
        this.path.add(current);    
    }

    public RandomWalk(int gridSize, long seed){
        this.gridSize = gridSize;
        this.done = false;
        this.start = new Point(0, gridSize - 1);
        this.end = new Point(gridSize - 1, 0);
        this.current = this.start;
        this.gen = new Random(seed);
        this.path = new ArrayList<Point>();
        this.path.add(current);
    }

    @Override
    public void step() {
        int x = current.x;
        int y = current.y;
        int ran = gen.nextInt(2);
        if (current != end){
            
             
            if (ran == 0){                   // go right
                if(x != end.x){
                    x++;
                }else{
                    y--;
                }
                current = new Point(x, y);
		        path.add(current);
            }
            if(ran == 1){                  //go up
                if (y != end.y){
                    y--;

                }else{
                    x++;
                }
                current = new Point(x, y);
		        path.add(current);
                
            }
            if(x == end.x && y == end.y){
                current = end;
            }
                 
        }else{
            done = true;
        }
        
            
        
    }
   
    @Override
    public void createWalk() {

        while(!done){
            step();

        }
        
        
        
    }

    @Override
    public boolean isDone() {
        
        return this.done;
    }

    @Override
    public int getGridSize() {
        
        return this.gridSize;
    }

    @Override
    public Point getStartPoint() {
       
        return this.start;
    }

    @Override
    public Point getEndPoint() {
        
        return this.end;
    }

    @Override
    public Point getCurrentPoint() {
        
        return this.current;
    }

    @Override
    public ArrayList<Point> getPath() {
    
         
        return this.path;
    }

    public String toString(){
        String walker = "";

        for(Point point : this.path){
            walker += "[" + point.x + "," + point.y + "] ";

        }
        return walker;
    }
    
    
}
