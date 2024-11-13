public class OperatorClass {
    public static void main(String[]args){
        // arithimatic operator
        // +,-,*,/,%
        int intVar1 =10, intVar2 =20;
        int addOper = intVar1+intVar2; //+10+20
        int minusOper = intVar1-intVar2; //10-20
        int multOper = intVar1*intVar2; //10*20
        int divOper = intVar1/intVar2; //10/20
        int modOper = intVar1%intVar2; //10%20(remainder)
 
        //Assignment Operator
        int assignVar = 10;
        assignVar += 20; //10+20= 30
        assignVar -= 15; //30-15=15
        assignVar *= 2; //15*2=30
        assignVar /= 10; //30/10=3
        assignVar %= 2;  //3%2=1
 
        //unary operator
        int unaryVar = 20;
        unaryVar ++; //unaryVar += 1; 20+1;
        unaryVar --; //unaryVar -= 1;21-1; 20
        
 
    }
}
 

