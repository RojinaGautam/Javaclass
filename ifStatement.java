public class ifStatement {
 public static void main(String[]args){
    //If statement,decision making
    int num1 = 10;
    if(num1>10){
        System.out.println("Greater than 10");
        //more statement
    }
    //If - else statement
    if(num1>20){
        System.out.println("Greater than 2o");
    }else{
        System.out.println("Lesser than 20");
    }
    //if-else-if
    if(num1 == 10){
        System.out.println("Num is 10");
    }else if (num1 == 9){
        System.out.println("Num is 9");
    }else{
        System.out.println("Num is unknown");
    }
    //if-else-if ladder //multiple else if
    String bevarage = "coke";
    if(bevarage == "fanta"){
        System.out.println("orange drink");
    }else if (bevarage == "coke"){
        System.out.println("Black coffee");
    }else if (bevarage == "sprite"){
        System.out.println("Clear drink");
    }else{
        System.out.println("Unknown drink");
    }
    //Nested if
    if (bevarage == "coke"){
        if (num1 == 10){
            System.out.println("coke and 10");
        }else{
            System.out.println("only coke");
        }
        }else{
            if(num1 ==10){
                System.out.println("only 10");
        }else{
            System.out.println("No coke and 10");
        }
        } 
    }   
}


//task 1
//make a variable int day and assign value
//if day is 1 ->print sunday
//if day is 2 ->print monday
//if day is 3 ->print tuesday
//if day is 4 ->print wednesday
//if day is 5 -> print thursday
//if day is 6 ->print friday
//if day is 7->print saturday
//if day is not in number -> print unknown day




//task 2
//make a variable avgMark and a char variable gender
//if avgMark is greater than 80 and gender is'M' print "good boy"
//if avgNark is greater than 80 and gender is 'F' print "good girl"
//if avgMark is notgreater than 80 and gender is 'M' print "bad boy"
//if avgMark is notgreater than 80 and gender is 'F' print "bad girl"
