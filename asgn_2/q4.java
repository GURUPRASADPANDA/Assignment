class Deposit{
    long Principal;
    int Time;
    double Rate;
    double TotalAmt; 
 
    Deposit ( )
    {
     
    }
    Deposit (long Principal, int Time, double Rate)
    {
      this.Principal = Principal;
      this.Time = Time;
      this.Rate=Rate;
    }
    Deposit (long Principal, int Time)
    {
        this.Principal = Principal;
        this.Time = Time;
    }
    Deposit (long Principal, double Rate)
    {
        this.Principal = Principal;
        this.Rate=Rate;
    }
    void display ( )
    {
        System.out.println("Principal is :"+Principal);
        System.out.println("Time :"+Time);
        System.out.println("Rate :"Rate);
        System.out.println("Total amount is :"+TotalAmt);
        
    }
    void calcAmt( )
    {
        this.TotalAmt = (double)Principal + (Principal*Time)/100;
    }
}



class q4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit(1000,2,5);
        d1.calcAmt();
        d1.display();
    }
}
