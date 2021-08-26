
package C3;


public class COCOMO {

    public COCOMO() {
    }
    
    public double calcEffort(String appType, double kloc)
    {
        double a=0, b=0;
        double effort;
        switch(appType)
        {
            case "Organic":
                a=2.4;
            break;
            case "Semidetached":
                a=3.0;
            break;
            case "Embedded":
                a=3.6;
            break;
        }
        switch(appType)
        {
            case "Organic":
                b=1.05;
            break;
            case "Semidetached":
                b=1.12;
            break;
            case "Embedded":
                b=1.20;
            break;
        }
        effort=a*(Math.pow(kloc,b));
        return effort;
    }
    
        public double calcTimeDev(double effort, String appType)
    {
        double c=0, d=0;
        double timedev;
        switch(appType)
        {
            case "Organic":
                c=2.5;
            break;
            case "Semidetached":
                c=2.5;
            break;
            case "Embedded":
                c=2.5;
            break;
        }
        switch(appType)
        {
            case "Organic":
                d=0.38;
            break;
            case "Semidetached":
                d=0.35;
            break;
            case "Embedded":
                d=0.32;
            break;
        }
        timedev=c*Math.pow(effort,d);
        return timedev;
    }
        
    public double calcNumStaffMonth(double effort, double timedev)
    {
        double staffmonth;
        staffmonth=effort/timedev;
        return staffmonth;
    }
    
    public double calcNumStaffWhole(double staffmonth, double timedev)
    {
       double staffwhole;
       staffwhole=staffmonth/timedev;
       return staffwhole;
    }  
    
    public double calcCostEstimation(double salary, double staffwhole, double timedev)
    {
        double cost;
        cost=salary*staffwhole*timedev;
        return cost;
    }
    
    
}
