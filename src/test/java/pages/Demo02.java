package pages;

public class Demo02 {

    // variable name of memory location
    // primative data type and non-primative
    // boolean, char, byte, short, int, long, float, double....

    public static void main(String[] args) {

//       String browser = "chrome";
//        if(browser.equals("firefox")){
//            System.out.println("open in firefox");
//        }
//        else if (browser.equals("chrome"))
//        {
//            System.out.println("open in chrome");
//        }
//        else {
//            System.out.println("default browser");
//        }//

        Demo02 d1 = new Demo02();
        int add = d1.sum(20,50);
        System.out.println(add);
        String myname = d1.fullname("yash", "dev");
        System.out.println(myname);
    }

    public int sum( int a, int b){

        int c = a+b;
        return c;
       // System.out.println(c);
    }

    public String fullname(String a, String b){
        String all = a + b;
        return all;
    }

}
