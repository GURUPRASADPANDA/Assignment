abstract class Marks
{
  double markICP;
  double markDSA;
  double percentage;
  public abstract void Percentage();
}
class CSE extends Marks
{
    double algoDesign;
    CSE(double markICP,double markDSA,double algoDesign)
    {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }
    public void Percentage()
    {
        this.percentage = ((markICP + markDSA + algoDesign)/300)*100;
        System.out.println(percentage);
    }
}
class NonCSE extends Marks
{
   double enggMechanics;
   NonCSE(double markICP,double markDSA,double enggMechanics)
    {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }
    public void Percentage()
    {
        this.percentage = ((markICP + markDSA + enggMechanics)/300)*100;
        System.out.println(percentage);
    }
}
class q6 
{
    public static void main(String[] args) 
  {
        CSE s1 = new CSE(90,91,96);
        NonCSE s2 = new NonCSE(56,60,58);
        s1.Percentage();
        s2.Percentage();
    }
}
