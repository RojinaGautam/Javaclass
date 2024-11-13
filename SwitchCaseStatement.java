public class SwitchCaseStatement {
    public static void main (String[]args){
        int day=1;
        //day == 0
        switch(day){
            case 0:
              System.out.println("Sunday");
              break;
            case 1:
              System.out.println("Monday");
            case 2:
              System.out.println("Tuesday");
            
            default:
              System.out.println("Unknown Day");
              break;
        }

        //nested switch statement
        String beverage ="Coke";
        char gender ='M';
        switch(beverage){
            case"Coke":
            switch (gender){
                //coke and M
                case 'M':
                System.out.println("Male");
                break;
                case 'F':
                System.out.println("Female");
            }
            System.out.println("Black");
            break;
        default:
            System.out.println("Unknown beverages");
            break;
        
        }

        //Switch case or
        int status = 404;
        switch(status){
            //status == 200||status == 201|| status == 202
            case 200:
            case 201:
            case 202:
             System.out.println("Success");
             break;
        //status == 401 || status == 404
        case 401:
        case 404:
             System.out.println("Not found");
             break;
        default:
            System.out.println("Unknown status");
            break;
        }

        //Task 1
        //make an int month and assign value
        //int month = 4;
        //using switch case check the month and print the following
        //0 -> Jan
        //1-> Feb
        //2-> Mar
        //3 -> Jun
        //..continue each month till 11
        //11 -> Dec
        //else -> Unknown month

        int month = 4;
        switch (month){
            case 0:
            System.out.println("Jan");
            break;
            case 1:
            System.out.println("Feb");
            break;
            case 2:
            System.out.println("Mar");
            break;
            case 3:
            System.out.println("april");
            break;
            case 4:
            System.out.println("may");
            break;
            case 5:
            System.out.println("June");
            break;
            case 6:
            System.out.println("July");
            break;
            case 7:
            System.out.println("august");
            break;
            case 8:
            System.out.println("september");
            break;
            case 9:
            System.out.println("october");
            break;
            case 10:
            System.out.println("november");
            break;
            case 11:
            System.out.println("december");
            break;

        }

            



            



        //Task 2
        // Make a variable string locale and assign "np"
        //String locale = "np"
        //using switch case check the and print the following
        //"en" or "en/us" oo "en/uk" -> "Selected english"
        //"in" -> "Selected Indian"
        //"jp" ->"Selected Japanese"
        //"np" -> "Selected Nepali"
        //else -> "Unknown locale"
        String locale = "np";
        switch (locale){
            case "en/us or en/uk":
            System.out.println("Selected english");
            break;
            case "in":
            System.out.println("Selected Indian");
            break;
            case "jp":
            System.out.println("Selected Japanese");
            break;
            case "np":
            System.out.println("Selected Nepali");
            default:
                System.out.println("unknown locale");
            break;
        }
 
    }
}
 