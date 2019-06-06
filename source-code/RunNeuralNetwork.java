import java.util.ArrayList;
import java.util.Scanner;

public class RunNeuralNetwork 
{
    static NeuralNetwork neuralNetwork = new NeuralNetwork ();
    static Scanner userScanner = new Scanner (System.in);
    
    public static void main ( String [ ] stuff )
    {
        trainNeuralNetwork ();
        testNeuralNetwork ();
    }
    
    public static void trainNeuralNetwork ()
    {
        for(int tDI = 0; tDI < getTrainingData ().size(); tDI ++ )
        {
            //eg 1,1:0
            String eachTrainingLine = getTrainingData ().get(tDI);
            String eachTrainingInputLine = eachTrainingLine.split (":")[0];
            String [] trainingInputParts = eachTrainingInputLine.split (",");
            
            int firstPartOfInput = Integer.parseInt(trainingInputParts[0]);
            int secondPartOfInput = Integer.parseInt(trainingInputParts[1]);
            
            neuralNetwork.doForwardPropagation (new int [] {firstPartOfInput,secondPartOfInput });
            
            int eachLabel = Integer.parseInt(eachTrainingLine.split (":")[1]);
            neuralNetwork.doBackwardPropagation (eachLabel);
            
        }
    }
    public static void returnToTestMenu ()
    {
        userScanner.nextLine();
        userScanner.nextLine();
        System.out.println ("\f");
        testNeuralNetwork ();
    }
    public static void testNeuralNetwork ()
    {
        System.out.println ( "ITS2019 Basic Neural Network" );
        System.out.println ( "1. Get neural network guess for input 1, 1 " );
        System.out.println ( "2. Get neural network guess for input 1, 0 " );
        System.out.println ( "3. Get neural network guess for input 0, 1 " );
        System.out.println ( "4. Get neural network guess for input 0, 0 " );
        System.out.println ( "5. Get me out of here." );
        int userInput = userScanner.nextInt ();
        
        switch(userInput)
        {
            case 1:
            {
                int [] inputs = new int [ ] { 1, 1 };
                neuralNetwork.doForwardPropagation (inputs);
                System.out.println ("Neural network answer = " + neuralNetwork.getOutcome () + " at input = 1,1");
                returnToTestMenu ();
            }
            break;
            case 2:
            {
                int [] inputs = new int [ ] { 1, 0 };
                neuralNetwork.doForwardPropagation (inputs);
                System.out.println ("Neural network answer = " + neuralNetwork.getOutcome () + " at input = 1,0");
                returnToTestMenu ();
            }
            break;
            case 3:
            {
                int [] inputs = new int [ ] { 0, 1 };
                neuralNetwork.doForwardPropagation (inputs);
                System.out.println ("Neural network answer = " + neuralNetwork.getOutcome () + " at input = 0,1");
                returnToTestMenu ();
            }
            break;
            case 4:
            {
                int [] inputs = new int [ ] { 0, 0 };
                neuralNetwork.doForwardPropagation (inputs);
                System.out.println ("Neural network answer = " + neuralNetwork.getOutcome () + " at input = 0,0");
                returnToTestMenu ();
            }
            break;
            case 5:
            {
                System.exit (0);
            }
            break;   
        }
    }
    
    public static ArrayList <String> getTrainingData ()
    {
        ArrayList <String> returnValue = new ArrayList <String> ();
        
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "1,0:1" );
        returnValue.add  ( "0,1:1" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "0,0:0" );
        returnValue.add  ( "1,1:0" );
        returnValue.add  ( "0,0:0" );

        return returnValue;
    }
}