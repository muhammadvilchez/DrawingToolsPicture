
/**
 * This class is for your week 1 portfolio project.
 * You need to draw a picture of a vehicle and add methods to move
 * the vehicle right and left across the canvas.
 * Put your name into the template below:
 * 
 * @author (Ramon Vilchez-Garcia) 
 * @version (0.1 05/01/2022)
 */
public class Vehicle
{
    private Circle frontTyre;
    private Circle frontWheel;
    private Circle backTyre;
    private Circle backWheel;
    private Rectangle Bus;
    private Rectangle windShield;
    private Rectangle firstWindow;
    private Rectangle secondWindow;
    private Rectangle thirdWindow;

    /**
     * Constructor for objects of class Vehicle.
     */
    public Vehicle()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw your vehicle.
     */
    public void draw()
    {
        Bus = new Rectangle();
        Bus.moveHorizontal(50);
        Bus.moveVertical(100);
        Bus.changeSize(300, 100);
        Bus.makeVisible();
        
        frontTyre= new Circle();
        frontTyre.changeColor("black");
        frontTyre.moveHorizontal(100);
        frontTyre.moveVertical(200);
        frontTyre.changeSize(40);
        frontTyre.makeVisible();
        
        backTyre = new Circle();
        backTyre.changeColor("black");
        backTyre.moveHorizontal(300);
        backTyre.moveVertical(200);
        backTyre.changeSize(40);
        backTyre.makeVisible();
        
        frontWheel= new Circle();
        frontWheel.changeColor("white");
        frontWheel.moveHorizontal(100);
        frontWheel.moveVertical(200);
        frontWheel.changeSize(20);
        frontWheel.makeVisible();
        
        backWheel = new Circle();
        backWheel.changeColor("white");
        backWheel.moveHorizontal(300);
        backWheel.moveVertical(200);
        backWheel.changeSize(20);
        backWheel.makeVisible();     
        
        windShield = new Rectangle();
        windShield.changeColor ("blue");
        windShield.moveHorizontal(335);
        windShield.moveVertical(120);
        windShield.changeSize(15, 50);
        windShield.makeVisible();
        
        firstWindow = new Rectangle();
        firstWindow.changeColor ("blue");
        firstWindow.moveHorizontal(240);
        firstWindow.moveVertical(120);
        firstWindow.changeSize(50, 50);
        firstWindow.makeVisible();
        
        secondWindow = new Rectangle();
        secondWindow.changeColor ("blue");
        secondWindow.moveHorizontal(160);
        secondWindow.moveVertical(120);
        secondWindow.changeSize(50, 50);
        secondWindow.makeVisible();
        
        thirdWindow = new Rectangle();
        thirdWindow.changeColor ("blue");
        thirdWindow.moveHorizontal(80);
        thirdWindow.moveVertical(120);
        thirdWindow.changeSize(50, 50);
        thirdWindow.makeVisible();
    }

    /**
     * Move your vehicle a little to the right.
     */
    public void moveRight()
    {
    Bus.moveHorizontal(20);
    windShield.moveHorizontal(20);
    firstWindow.moveHorizontal(20);
    secondWindow.moveHorizontal(20);
    thirdWindow.moveHorizontal(20);
    frontTyre.moveHorizontal(20);
    frontWheel.moveHorizontal(20);
    backTyre.moveHorizontal(20);
    backWheel.moveHorizontal(20);
    }

    /**
     * Move your vehicle a little to the left.
     */
    public void moveLeft()
    {
    Bus.moveHorizontal(-20);
    windShield.moveHorizontal(-20);
    firstWindow.moveHorizontal(-20);
    secondWindow.moveHorizontal(-20);
    thirdWindow.moveHorizontal(-20);
    frontTyre.moveHorizontal(-20);
    frontWheel.moveHorizontal(-20);
    backTyre.moveHorizontal(-20);
    backWheel.moveHorizontal(-20);
    }
}
