
public class NeuralNetwork
{
    double eta = 0.2;
    double alpha = 0.5;
    Layers layers = new Layers ( );
    Topology topology = new Topology ( "2,2,1" );
        
    public NeuralNetwork ( )
    {
        
        for ( int lSI = 0; lSI < topology.size ( ); lSI ++ )
        {
            layers.add ( new Layer( ));
            
            int numberOfWeightsFromNextNeuron = lSI + 1 < topology.size ( ) ? topology.get (lSI + 1 ) : 0;
            
            for ( int lI = 0; lI <= topology.get ( lSI ); lI ++ )
                layers.get ( lSI ).add ( new Neuron (  eta,  alpha,  lI,  numberOfWeightsFromNextNeuron) );
                
            Neuron lastNeuronPerLayer = layers.get ( lSI ).get ( layers.get ( lSI ).size ( ) - 1 );  
            lastNeuronPerLayer.setOutcome ( 1.0 );
        }
    }
        
    //do forward pass
    public void doForwardPropagation ( int [] inputs )
    {
        for ( int iI = 0; iI < inputs.length; iI ++ )
            layers.get ( 0 ).get ( iI ).setOutcome ( inputs [iI] );
            
        for ( int lSI = 1; lSI < topology.size ( ); lSI ++ )
        {
            Layer priorLayer = layers.get ( lSI - 1 );
            
            for ( int iI = 0; iI < topology.get ( lSI ); iI ++ )
            {
                layers.get ( lSI ).get ( iI ).doForwardPropagation ( priorLayer );
            }
        }
    }
    
    //do backward pass
    public void doBackwardPropagation ( int target )
    {
        Neuron firstNeuronInLastLayer = layers.get ( layers.size ( ) - 1 ).get ( 0 );
        firstNeuronInLastLayer.calculateOutcomeGradient ( target );
        
        for ( int lSI = layers.size ( ) - 2; lSI > 0; lSI -- )
        {
            Layer currentLayer = layers.get ( lSI );
            Layer nextLayer = layers.get ( lSI + 1 );
            
            for ( int iI = 0; iI < currentLayer.size ( ); iI ++ )
            {
                currentLayer.get ( iI ).calculateHiddenGradient ( nextLayer );
            }
        }
        
        for ( int lSI = layers.size ( ) - 1; lSI > 0; lSI -- )
        {
            Layer currentLayer = layers.get ( lSI );
            Layer priorLayer = layers.get ( lSI - 1 );
            
            for ( int iI = 0; iI < currentLayer.size ( ) -1; iI ++ )
            {
                currentLayer.get ( iI ).updateWeights ( priorLayer );
            }
        }
    }
    
    //get outcome
    public double getOutcome ( )
    {
        Neuron firstNeuronInLastLayer = layers.get ( layers.size ( ) - 1 ).get ( 0 );
        return firstNeuronInLastLayer.getOutcome ( );
    }
}
