class Interest
{
    public static void main(String args[])
    {
        double principal,rate,duration,maturity,interest;

        // Scanner sc = new Scanner();
        principal=20000;
        rate=9.5;
        duration=3;
        interest=principal*rate*duration/100;
        maturity=principal+interest;

        System.out.println("Principal amount is "+principal);
        System.out.println("Deposite for duration is "+duration);
        System.out.println("Interest rate is "+interest);
        System.out.println("Maturity amount is "+maturity);


    }



}