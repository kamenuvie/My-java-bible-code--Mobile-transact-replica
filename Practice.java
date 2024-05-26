public class Practice {
    // the addNumber is the instance of the class Practice and a method
    int addNumbers( int a, int b){
        int product = a * b;
                return product;

                // method overriding

    };
    public static void main(String[]args){

        // ways of defining arrays
        int[]  age = {23, 45,21,65,87};

        int i;

        for(i=0;i <age.length; i++){
            System.out.println(age[i]);
        }
            String[] names = new String[4];
            names[0] = "kofi";
            names[1] = " Kelly";
            names[2] = " gad ";
            names[3] = " mercy";
            System.out.println(names[0]);
            System.out.println(names[1]);
            System.out.println(names[2]);
            System.out.println(names[3]);

            String[] name ={"wisdom", "kelly","Sarpong"};
            System.out.println(name[0]);
            Practice obj = new Practice();
            System.out.println(obj.addNumbers(5,6));



    }

}
