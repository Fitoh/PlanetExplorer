package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 133
// Finish time:

public class PlanetExplorer {
	
	private int xLocation = 0;
	private int yLocation = 0;
	private int gridWidth = 0;
	private int gridHeight = 0;
	private char facing = 'N';
	private String commandReturn;
	
	public PlanetExplorer(int x, int y, String obstacles){
	
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		gridWidth = x;
		gridHeight = y;

	}
	
	public int gridWidth(){
		return gridWidth;
	}
	
	public int gridHeight(){
		return gridHeight;
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		for (int i = 0; i < command.length(); i++) {
			
			if (facing == 'N' && command.charAt(i) == 'f'){
				yLocation = yLocation + 1;
			}else if (facing == 'N' && command.charAt(i) == 'd'){
				yLocation = yLocation - 1;
			}else if (facing == 'N' && command.charAt(i) == 'l'){
				facing = 'W';
			}else if (facing == 'N' && command.charAt(i) == 'r'){
				facing = 'E';
			}
			
			else if (facing == 'S' && command.charAt(i) == 'f'){
				yLocation = yLocation - 1;
			}else if (facing == 'S' && command.charAt(i) == 'd'){
				yLocation = yLocation + 1;
			}else if (facing == 'S' && command.charAt(i) == 'l'){
				facing = 'E';
			}else if (facing == 'S' && command.charAt(i) == 'r'){
				facing = 'W';
			}
			
			else if (facing == 'W' && command.charAt(i) == 'f'){
				xLocation = xLocation - 1;
			}else if (facing == 'W' && command.charAt(i) == 'd'){
				xLocation = xLocation + 1;
			}else if (facing == 'W' && command.charAt(i) == 'l'){
				facing = 'S';
			}else if (facing == 'W' && command.charAt(i) == 'r'){
				facing = 'N';
			}
			
			else if (facing == 'E' && command.charAt(i) == 'f'){
				xLocation = xLocation + 1;
			}else if (facing == 'E' && command.charAt(i) == 'd'){
				xLocation = xLocation - 1;
			}else if (facing == 'E' && command.charAt(i) == 'l'){
				facing = 'N';
			}else if (facing == 'E' && command.charAt(i) == 'r'){
				facing = 'S';
			}
		}
		
		commandReturn = Integer.toString(xLocation) + "," + Integer.toString(yLocation);
		return commandReturn;
	}
}
