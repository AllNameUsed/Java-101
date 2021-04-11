public class FirstProgram {
    public static void main(String[] args) {
        System.out.println(addOne(5));

        int[] arrayOfNumbers = {6,5,2,6,0,2,6};
        // This is a simple for loop
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + ", ");
        }
        System.out.println();


        // This is also a simple for loop
        for (int i : arrayOfNumbers) {
            System.out.print(i + ", ");
        }
        System.out.println();


        // This is a simple while loop
        int i = 0;
        while (i < arrayOfNumbers.length) {
            System.out.print(arrayOfNumbers[i] + ", ");
            i++;
        }
        System.out.println();
    }

    // This is a simple program that takes an integer and add one to it:
    private static int addOne(int number) {
        return number + 1;
    }

}
