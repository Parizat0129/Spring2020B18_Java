package day25_MethodsRecap;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "ie", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class Driver {
    public static void main(String[] args) {
       // getDriver1("chrome");// argument is mandatory
      String str=getDriver1("Chrome");
        System.out.println(str);
     String str2= getDriver2("Safari");
        System.out.println(str2);
     String str3=getDriver3("Firefox");
        System.out.println(str3);

    }




    public static String getDriver1(String browserName){

        switch(browserName.toLowerCase().replace(" ","")){//"Chrome".toLowerCse()===>chrome
            case "chrome": return "Chrome Driver";

            case "firefox": return "FireFox Driver";

            case "safari": return "Safari Driver";

            case "opera":return "Opera Driver";

            case "edge":return "Edge Driver";

            default:return "Invalid Driver";
        }

    }

    public static String getDriver2(String browserName){
        browserName=browserName.toLowerCase();//to ignor case sensitivity

        if(browserName.equals("chrome")){
            return "Chrome Driver";
        }else if(browserName.equals("firefox")){
            return "FireFox Drive";
        }else if(browserName.equals("safari")){
            return "Safari Driver";
        }else if(browserName.equals("edge")){
            return "Edge Driver";
        }else if(browserName.equals("opera")){
            return "Opera Driver";
        }else{
            return "Invalid Driver";
        }


    }

    public static String getDriver3(String browserName){
        //:?,  :, ()?
        browserName=browserName.toLowerCase();
        return (browserName.equals("chrome"))?"Chrome Driver"
                :(browserName.equals("safari"))?"Safari Driver"
                :(browserName.equals("firefox"))?"FireFox Driver"
                :(browserName.equals("opera"))?"Opera Driver"
                :(browserName.equals("edge"))?"Edge Driver"
                :"Invalid Driver";



    }

}
