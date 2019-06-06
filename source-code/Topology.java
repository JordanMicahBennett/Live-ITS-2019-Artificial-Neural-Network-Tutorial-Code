import java.util.ArrayList;

public class Topology extends ArrayList <Integer>
{
    public Topology ( String description )
    {
        String [] parts = description.split ( "," );
        
        for  (int pI = 0; pI < parts.length; pI ++)
            add ( Integer.parseInt (parts [pI] ));
    }
}
