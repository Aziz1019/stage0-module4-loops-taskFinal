package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces
            for (int j = cathetusLength - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Print first half of pyramid (reversed numbers)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print second half of pyramid (regular numbers)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }    }
    public static void main(String[] args) {
//        new Pyramid().printPyramid(7);
        new Pyramid().printPyramid(5);
    }
}
