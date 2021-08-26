package C3;
import java.io.*;

public class UFP implements Serializable{
    public int[] userInputs = new int[3];
    public int[] userOutputs = new int[3];
    public int[] userInquiries = new int[3];
    public int[] internalFiles = new int[3];
    public int[] externalFiles = new int [3];

    public UFP() {
    }

    public int[] getUserInputs() {
        return userInputs;
    }

    public void setUserInputs(int[] userInputs) {
        this.userInputs = userInputs;
    }

    public int[] getUserOutputs() {
        return userOutputs;
    }

    public void setUserOutputs(int[] userOutputs) {
        this.userOutputs = userOutputs;
    }

    public int[] getUserInquiries() {
        return userInquiries;
    }

    public void setUserInquiries(int[] userInquiries) {
        this.userInquiries = userInquiries;
    }

    public int[] getInternalFiles() {
        return internalFiles;
    }

    public void setInternalFiles(int[] internalFiles) {
        this.internalFiles = internalFiles;
    }

    public int[] getExternalFiles() {
        return externalFiles;
    }

    public void setExternalFiles(int[] externalFiles) {
        this.externalFiles = externalFiles;
    }

    public void displayUFP(){
        for(int i=0;i<userInputs.length;i++){
            int a = userInputs[i];
            System.out.println(a);
        }
    }
    
    public double calcUFP(){
        int[][] wtFactors = {{3,4,6},{4,5,7},{3,4,6},{7,10,15},{5,7,10}};
        double UFP=0;
        int[] ui = getUserInputs();
        int[] uo = getUserOutputs();
        int[] uiq = getUserInquiries();
        int[] intf = getInternalFiles();
        int[] extf = getExternalFiles();
        
        for(int i=0;i<1;i++)
            for(int j=0;j<3;j++)
            {
                UFP += ui[j]*wtFactors[i][j];
            }
        for(int i=1;i<2;i++)
            for(int j=0;j<3;j++)
            {
                UFP += uo[j]*wtFactors[i][j];
            }
        for(int i=2;i<3;i++)
            for(int j=0;j<3;j++)
            {
                UFP += uiq[j]*wtFactors[i][j];
            }
        for(int i=3;i<4;i++)
            for(int j=0;j<3;j++)
            {
                UFP += intf[j]*wtFactors[i][j];
            }
        for(int i=4;i<5;i++)
            for(int j=0;j<3;j++)
            {
                UFP += extf[j]*wtFactors[i][j];
            }
        return UFP;
    }
    
}
