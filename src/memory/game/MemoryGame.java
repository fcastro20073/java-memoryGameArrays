/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;

/**
 *
 * @author mlarrubia
 */
public class MemoryGame {

    /**
     * @param args the command line arguments
     */
         static char[] deck = {'A','A','B','B','C','C','D','D','E','E','F','F','G','G','H','H'};
    public static void main(String[] args) {
        // TODO code application logic here

        int gridSize = 4;
        boolean[] cardDrawn = new boolean[16];
            char[][] grid = new char [gridSize][gridSize];
    
        
        for(int i = 0; i < grid.length; i++){
            
            
            if (grid [i][i] == chooseRandomCard()){
                System.out.println(grid[i][i]);
                System.out.println("This card has already been chosen.");
                System.out.println("The drawing will now repeat.");
                grid[i][i] = chooseRandomCard();
                
            
            }
            
            else{
                grid[i][i] = chooseRandomCard();
                cardDrawn [i] = true;
                System.out.println(grid[i][i]);
        }
        }
        
        
        
        
        
        
        
        
        
        
        
//        int gridSize = 4;
//        char[][]grid = new char[gridSize][gridSize];
//        
//        char randomCard = chooseRandomCard();
//        
//        for (int i = 0; i < grid.length; i++){
//            if(randomCard !=(grid[i][i])){
//                grid[i][i] = randomCard;
//                randomCard = chooseRandomCard();
//                System.out.println(grid[i]);
//            }
//            
//            else
//                randomCard = chooseRandomCard();
//                System.out.println(grid[i
//        }
        
    }
    
    public static char chooseRandomCard(){
         char randomCard = deck[(int)(Math.random()*16)+1 ];
         return randomCard;
        
    }
    
    
    
}
