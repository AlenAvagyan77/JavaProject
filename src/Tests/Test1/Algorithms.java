package Tests.Test1;

public class Algorithms {

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    printMatrix(matrix);
    System.out.println();
    catMatrix179(matrix);
    System.out.println();
    alsoReverseMatrix139(matrix);
    System.out.println();
    matrixReverse793(matrix);
    System.out.println();
    matrix713(matrix);
    reverseString("Automation");
//    boobleSorte(new int[]{4, 5, 8,488 ,7845, 1});
//    System.out.println(recursion(4));

  }

  //  public static int recursion(int n){
//    if(n == 0 || n == 1)
//      return 1;
//    return n * recursion(n - 1);
//  }

  public static void reverseString(String string) {
//    for (int i = string.length() - 1; i > 0; i--) {
//      System.out.print(string.charAt(i - 1));
//    }
//    System.out.println();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(string);
    stringBuilder.reverse();
    System.out.println(stringBuilder);
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }

    //1 2 3
    //4 5 6
    //7 8 9
  }

  public static void catMatrix179(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }

    //1
    //4 5
    //7 8 9
  }
  
  public static void alsoReverseMatrix139(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("\t");
      }

      for (int j = i; j < array.length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
    //1 2 3
    //  5 6
    //    9
  }

  public static void matrixReverse793(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        System.out.print("\t");
      }
      for (int j = array.length - i - 1; j < array.length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
    //     3
    //   5 6
    // 7 8 9
  }

  public static void matrix713(int[][] array) {
    int row = 0;
    for (int i = array.length; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(array[row][j] + "\t");
      }
      row++;
      System.out.println();
      if (row >= array.length) {
        break;
      }
    }

    //1 2 3
    //4 5
    //7
  }

  public static void boobleSorte(int[] array) {
    for (int a : array) {
      System.out.print(a + " ");
    }
    System.out.println();
    boolean whileIfInside = true;
    while (whileIfInside) {
      whileIfInside = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int z = array[i];
          array[i] = array[i + 1];
          array[i + 1] = z;
          whileIfInside = true;
        }
      }
    }
    for (int a : array) {
      System.out.print(a + " ");
    }
  }

//  public static void reverseString(String str) {
//    StringBuilder stringBuilder = new StringBuilder();
//    stringBuilder.append(str);
//    stringBuilder.reverse();
//    System.out.println(stringBuilder);
//  }
//
//  public static void primeNumber(int n) {
//    int count = 0;
//    for (int i = 2; i < n; i++) {
//      if (n % i == 0) {
//        count++;
//        break;
//      }
//    }
//    if (count == 0) {
//      System.out.println("This is a prime number");
//    } else {
//      System.out.println("This is not a prime number");
//    }
//  }
//
//  public static void printWithoutLoop(int n){
//    if (n <= 10){
//      System.out.print(n + " ");
//      printWithoutLoop(n + 1);
//    }
//  }
//
//  public static void boobleSort(int[] array) {
//    for (int a : array) {
//      System.out.print(a + " ");
//    }
//    boolean whileIfInside = true;
//    while (whileIfInside) {
//      whileIfInside = false;
//      for (int i = 0; i < array.length - 1; i++) {
//        if (array[i] > array[i + 1]) {
//          int z = array[i];
//          array[i] = array[i + 1];
//          array[i + 1] = z;
//          whileIfInside = true;
//        }
//
//      }
//    }
//    System.out.println();
//    for (int a : array) {
//      System.out.print(a + " ");
//    }
//    System.out.println();
//
//  }
//
//  public static void searchAlgorithm(int[] array, int number) {
//    boolean found = false;
//    for (int i = 0; i < array.length; i++) {
//      if (array[i] == number) {
//        System.out.println("I am found expected number" + " " + array[i]);
//        found = true;
//      }
//    }
//    if (!found) {
//      System.out.println("I am not found number");
//    }
//  }
}

