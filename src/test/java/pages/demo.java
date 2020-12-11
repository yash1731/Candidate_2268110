package pages;

public class demo {
    public static void main(String[] args) {

      int a[] = new int[3];
      int b[] = {2,5,7,9,17,18};
      int school[][] = {{2, 4}, {5,10,20}};
        System.out.println(school[0][0]);



      a[0] = 10;
      a[1] = 20;
      a[2] = 30;

        String name[] = {"yash", "simon", "peter", "julie"};
        System.out.println(name[3]);

        for(int i=0; i< name.length; i++){
            System.out.println("my name is--> " + name[i]);
        }

        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

        for(int j=0; j<b.length;j++){
            System.out.println("b ==> " + b[j]);
        }
        for(int i: b){
            System.out.println("for each" + ":" +  i);
        }

        int s[] = new int[3];
        s[0]= 5;
        s[1] = 10;
        s[2] = 26;



        for(int i=0; i<s.length;i++){
            System.out.println(s[i]);
        }


        String string="whatever";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);

       String x = "all";

       String rev = new StringBuffer(x).reverse().toString();

        System.out.println(rev);

    }


    }
