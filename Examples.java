public class Examples {
    public static void main(String[] args) {

        //Question 1

        System.out.println("Hello, I am Keng Li!");

        //Question 2

        String moduleCode ="CSC1009";
        switch (moduleCode) {
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;

            default:
                System.out.println("After switch");
                break;
        }

        //Question 3

        for (int i = 102; i > 66; i--) {
            if (i%2 !=0){
                System.out.println("Value of x:" + i);
            }
        }

    }
    
}
