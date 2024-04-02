

/**
 * Write a description of class Horse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Horse
{
    String name;
    char symbol;
    double confidence;
    int distance;
    boolean fallen;


    //Constructor of class Horse
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.symbol = horseSymbol;
        this.name = horseName.toUpperCase();
        this.confidence = horseConfidence;
        this.distance = 0;
        this.fallen = false;
    }

    //Other methods of class Horse
    public void fall()
    {

        this.fallen = true;
    }

    public double getConfidence()
    {

        return this.confidence;
    }

    public int getDistanceTravelled()
    {
        return this.distance;
    }

    public String getName()
    {

        return this.name;
    }

    public char getSymbol()
    {
        return this.symbol;
    }

    public void goBackToStart()
    {
        this.distance = 0;
    }

    public boolean hasFallen() {
        if (this.fallen) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void moveForward()
    {
        this.distance += 1;
    }

    public void setConfidence(double newConfidence)
    {
        this.confidence = newConfidence;
    }

    public void setSymbol(char newSymbol)
    {
        this.symbol = newSymbol;
    }

}
