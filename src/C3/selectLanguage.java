
package C3;


public class selectLanguage {
    private String language;

    public selectLanguage() {
    }

    public selectLanguage(String language) {
        this.language=language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    
    public String verify()
    {
        boolean check;
        if(getLanguage().equals(" "))
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
        return "Choose Language"; 
    }
   
    public double calcKLOC(double fp)
    {
        int loc=0;
        double kloc;
        switch(language)
        {
            case "Access": loc=38;
                break;
            case "Basic": loc=107;
                break;
            case "C": loc=128;
                break;
            case "C++": loc=53;
                break;
            case "COBOL": loc=107;
                break;
            case "Delphi": loc=29;
                break;
            case "Java": loc=53;
                break;
            case "Machine Language": loc=640;
                break;
            case "Visual Basic 5": loc=640;
                break;
        }
        kloc=fp*loc/1000;
        return kloc;
    }
    
    
}
