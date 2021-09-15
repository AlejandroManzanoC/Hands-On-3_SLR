
package slr;

import java.text.DecimalFormat;


public class Data extends SLR implements Exec {
    
    //Fixed Data
    private final int n=9;
    private final double x_arr[]= new double[]{23.0, 26.0, 30.0, 34.0, 43.0, 48.0, 52.0, 57.0, 58.0};
    private final double y_arr[]= new double[]{651.0, 762.0, 856.0, 1063.0, 1190.0, 1298.0, 1421.0, 1440.0, 1518.0};
    
    //Equation's variables
    double x, y;
    
    //Input's constructor
    public Data(double x) {
        this.x = x;
    }
    
    
    @Override
    public void Data() {
        
        //Variables
        double sum_xi=0.0, sum_yi=0.0, sum_xiyi=0.0, sum_xi2=0.0, sum_xisquared=0.0; 
        double x_avg=0.0, y_avg=0.0;
        double beta1, beta0;
        
        //Sums
        for (int i=0; i<n; i++) {
            sum_xi += x_arr[i];
            sum_yi += y_arr[i];
            sum_xiyi += x_arr[i]*y_arr[i];
            sum_xi2 += x_arr[i]*x_arr[i];
            
        }
        
        sum_xisquared= sum_xi*sum_xi;
        
        //Mean
        x_avg = sum_xi/n;
        y_avg = sum_yi/n;
        
        //Coefficients
        beta1= (n*sum_xiyi - sum_xi*sum_yi)/(n*sum_xi2 - sum_xisquared);
        beta0= y_avg - beta1*x_avg;
        
        //Regression Model
        y= beta0+ beta1*x;
        
        //Regression Equation
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("ÿ = "+numberFormat.format(beta0)+" + "+numberFormat.format(beta1)+"x1");
        
        System.out.print("\n Investment in advertising: \n -->"+x);
        System.out.print("\n Sales income: \n -->");
        System.out.printf("%.2f", y);
        System.out.print("\n");
    }

}