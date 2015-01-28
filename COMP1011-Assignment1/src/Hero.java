/**
 * This class creates Hero objects.
 * 
 * @author Blaine Parr
 * @version January 27, 2015
 */
public class Hero 
{
	//variables
	private int strength;
	private int speed;
	private int health;
	public String name;
	
	/**
	 * This constructor generates Hero objects with the name provided by the user.
	 * @param name The name of the hero
	 */
	public Hero(String name)
	{
		this.name = name;
		this.generateAbilities();
	} //constructor ends
	
	//Private Methods/////////////////////////////////////////////////////////////////////////////
	/**
	 * This method randomly generates the values for the strength, speed and health abilities of
	 * the hero
	 */
	private void generateAbilities()
	{
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	} //method generateAbilities ends
	
	//Public Methods//////////////////////////////////////////////////////////////////////////////
} //class Hero ends
