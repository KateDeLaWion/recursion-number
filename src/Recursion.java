public class Recursion {

    public static void main(String[] args) {

        // if static initialized getTriangularNumberR() , then no need to produce object recursionTool, we
        // can just write    getTriangularNumberR(6);
        Recursion recursionTool = new Recursion();

        // print triangular number without using recursion
        System.out.println("Triangular number without using recursion : " + recursionTool.getTriangularNumber(6));


// print triangular number using recursion
        System.out.println("Triangular number using recursion : " + recursionTool.getTriangularNumberR(6));


        recursionTool.reduceByOne(10);

    }


    // print triangular number without using recursion
    public int getTriangularNumber(int number){
        // eg. 6+5+4+3+2+1=21
        int triangularNumber=0;
        while (number>0){
            triangularNumber = triangularNumber + number;
            number--;
        }
        return triangularNumber;
    }


    // print triangular number using recursion
    // if write  public static int getTriangularNumberR(int number){ , no need to produce object, the main
    // can just write     public int getTriangularNumberR(6);   to use this method.
    public int getTriangularNumberR(int number){
            System.out.println("Method stored in stack number " + number);
            if (number == 1) {
                System.out.println("Return 1 in first part of:   if statement");
              return 1;
            } else {
                System.out.println("else number is " + number);
                // result is not worked here until all recursion is done
                // and result is worked under   int result = number + getTriangularNumberR(number - 1);
                int result = number + getTriangularNumberR(number - 1);
                System.out.println("Return result of " + result);
                return result;
            }
        }


    // static is used, so ReduceByOne can be used by main without creating its object
    public static void reduceByOne(int n){
        if(n>=0){
            reduceByOne(n-1);
        }
        System.out.println("Completed call then stack gives out: " + n);
    }



}
