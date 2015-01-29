/**
 * This class runs the game, creating a Hero object and testing its methods.
 * @author Blaine Parr
 * @version January 28, 2015
 * 
 * Revision History:
 * v0.1:
 * -Created Project
 * 
 * v0.2:
 * -Created Hero Class with some variables and methods
 * 
 * v0.3:
 * -Finished methods in Hero Class
 * 
 * v0.4:
 * -Created Game Class and created a Hero object in the new Class
 * -Fixed Hero Class' hitAttempt method to print the damage dealt
 * 
 * v1.0
 * -Finished Game Class, with Hero using abilities
 * -Added a message to hitAttempt displaying "Damage Dealt: "
 * 
 * v1.1
 * -Changed asterisks printed in the Hero Class' to be printed after <Name>'s stats
 */
public class Game 
{
	public static void main(String[] args) 
	{
		//create the Hero
		Hero hero = new Hero("Not-so-super Man");
		
		//display the hero's abilities
		hero.show();
		
		//calls the fight method, determining if the hero hit their target, and displaying the
		//damage they dealt if they did
		hero.fight();
	} //method main ends
} //class Game ends
