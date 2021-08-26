
package C3;

public class AdjustedFunctionPoint {
    int[] GSC = new int[14];
    double vaf;

    public AdjustedFunctionPoint() {
    }
    
    public int[] getGSC() {
        return GSC;
    }
    
    public void setGSC(int[] GSC) {
        this.GSC = GSC;
    }

    public void displayGSC() {
        for(int i = 0; i < GSC.length; i++) {
            int a = GSC[i];
            
            System.out.println("GSC:" + i + ": " + a);
        }      
    }
    
    public double calcVAF() {
        int degree = 0;
        for(int i = 0; i < GSC.length; i++) {
            degree += GSC[i];
        }
        vaf = (double) ((degree * 0.01) + 0.65);
        return vaf;
    }
    
}
