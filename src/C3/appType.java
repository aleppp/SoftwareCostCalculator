
package C3;

public class appType {
    private String appType=null;

    public appType() {
    }

    public appType(String appType) {
        this.appType= appType;
    }

    public String getType() {
        return appType;
    }

    public String verify()
    {
        boolean check;
        if(getType()==null)
        {
            check=true;
        }
        else
        {
            check=false;
        }
        
        if(check)
        {
           return displayError(); 
        }
        else
        {
            return "Success";
        }
    }
    
    public String displayError()
    {
        return "Choose Application Type"; 
    }
}
