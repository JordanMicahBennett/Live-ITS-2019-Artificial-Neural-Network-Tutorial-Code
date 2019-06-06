public class Synapse
{
    //features
    private double weight;
    private double deltaWeight;
    
    //methods
    public void setWeight  ( double value)
    {
        weight = value;
    }
    public void setDeltaWeight  ( double value)
    {
        deltaWeight = value;
    }
    public double getWeight  ( )
    {
       return weight;
    }
    public double getDeltaWeight  ()
    {
        return deltaWeight;
    } 
}
