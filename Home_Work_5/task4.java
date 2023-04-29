package Home_Work_5;

public class task4 {
  private static final int BOARD_SIZE = 8;
  private static int[] positions = new int[BOARD_SIZE];

  public static void main(String[] args) {
      placeQueens(0);
  }

  private static void placeQueens(int row) {
      if (row == BOARD_SIZE) {
          printBoard();
          return;
      }
      for (int col = 0; col < BOARD_SIZE; col++) {
          if (isValidPosition(row, col)) {
              positions[row] = col;
              placeQueens(row + 1);
          }
      }
  }

  private static boolean isValidPosition(int row, int col) {
      for (int i = 0; i < row; i++) {
          int position = positions[i];
          if (position == col || position - i == col - row || position + i == col + row) {
              return false;
          }
      }
      return true;
  }

  private static void printBoard() {
      for (int row = 0; row < BOARD_SIZE; row++) {
          for (int col = 0; col < BOARD_SIZE; col++) {
              System.out.print(positions[row] == col ? "Q " : "- ");
          }
          System.out.println();
      }
      System.out.println();
  }
}

