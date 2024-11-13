public class VariableExample {
    // Instance Variable
    int instanceVariable= 100;
    // instance variable can only be accessed with the object
    // static variable
    static boolean staticVariable= false;
    // staticvariable can be accessed with class directly

    void firstFunction(){
        int localVariable = 300;
        // local variable are made inside a function/constructor scope/block
        System.out.println("local variable;"+localVariable);
    }

    public static void main (String[]args){
        int localVariable2=400;
        System.out.println("Local Variable:"+localVariable2);
        // To use the instace variable of a class,make object
        // syntax:ClassName objVariable=new ClassName
        VariableExample variableExampleObj= new VariableExample();
        // the variable of variableExample is called object,here variableExampleObj
        System.out.println("Intance Variable:"+variableExampleObj.instanceVariable);
        // static variable can be accessed with,ClassName.variableName
        System.out.println("Static Variable;"+VariableExample.staticVariable);
        // Java typeCasting Primitive Datatype
        // Widening Castling/implicit Casting/automatic
        // conversion of smaller datatype to larger datatype (size/capacity)
        // byte->short->char->int->long-> float ->double
        byte byteVariable =10;
        short shortVariable=byteVariable;  // here byte is automatically converted to short 
        
        int mathMark=20;
        double mathConverted =mathMark; //int is automatically converted to double ->20.0
        System.out.println("Int to double"+mathConverted);

        //narrowing castling/explicit castling/manual
        //conversion of larger datatype to smaller datatype
        double gpa=3.4;
        int gpaInt=(int) gpa;
        System.out.println("GPA int"+gpaInt);
        int floatConversion=(int) 400.33f; //400

    //Calculation
    float mathCalc=1/2; //1/2 in int is 0-> 0.0
    System.out.println(mathCalc);
    float mathCalcSolve=1.0f/2 //either one value float 
    float mathCalvSolve2=(float) 1/2; //or manual cast


    }

    
}



/*Task
 * make an instance variable firstName
 * make new object and print the following 
 * calculate and print the following
 * double avg=13/2
 * float pct=411/100
 */

