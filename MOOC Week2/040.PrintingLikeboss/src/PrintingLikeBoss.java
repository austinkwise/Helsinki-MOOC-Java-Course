public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
    	int i = 0;
    	while(i < amount) {
    		System.out.print("*");
    		i++;
    	}
    	System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
    	int i = 0;
    	while(i < amount) {
    		System.out.print(" ");
    		i++;
    	}
    }

    public static void printTriangle(int size) {
        // 40.2
    	int l = 1;
    	while(l <= size) {
    		printWhitespaces(size - l);
    		printStars(l);
    		l++;
    	}
    }

    public static void xmasTree(int height) {
        // 40.3
    	int j = 1;
    	int k = 1;
    	while (j <= height) {
    		printWhitespaces(height - j);
    		printStars(k);
    		j++;
    		k += 2;
    	}
    	int m = 0;
    	while(m < 2) {
    		printWhitespaces(j - 3);
    		printStars(3);
    		m++;
    	}
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(5);
        System.out.println("---");
        xmasTree(7);
        System.out.println("---");
        xmasTree(10);
    }
}

