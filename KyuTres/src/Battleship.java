import java.util.*;


public class Battleship {

    /*
    * Write a method that takes a field for well-known board game "Battleship" as an argument and returns true if it has a valid disposition of ships, false otherwise. Argument is guaranteed to be 10*10 two-dimension array. Elements in the array are numbers, 0 if the cell is free and 1 if occupied by ship.
    * */
    public static void main(String[] args) {
        System.out.println(fieldValidator(new int[][]{
                {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}));
    }

    private static final int SIZE = 10;
    private static final int[][] DIRECTIONS = {
            {1, 0}, {0, 1} // solo abajo y derecha (para detectar barcos)
    };

    private static final int[][] NEIGHBORS = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1},  {1, 0}, {1, 1}
    };

    public static boolean fieldValidator(int[][] field) {
        boolean[][] visited = new boolean[SIZE][SIZE];
        int[] shipCount = new int[5];

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (field[row][col] == 1 && !visited[row][col]) {
                    int shipSize = exploreShip(field, visited, row, col);
                    if (shipSize < 1 || shipSize > 4) return false;
                    shipCount[shipSize]++;
                }
            }
        }

        return shipCount[1] == 4 &&
                shipCount[2] == 3 &&
                shipCount[3] == 2 &&
                shipCount[4] == 1;
    }

    private static int exploreShip(int[][] field, boolean[][] visited, int row, int col) {
        List<int[]> shipCells = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        visited[row][col] = true;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];
            shipCells.add(cell);

            if (!isShipIsolated(field, r, c)) return -1;

            // Solo explorar arriba, abajo, izquierda y derecha
            int[][] cardinal = {{-1,0}, {1,0}, {0,-1}, {0,1}};
            for (int[] dir : cardinal) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                if (isInBounds(newRow, newCol) && field[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }

        // Verificar que todas las celdas están alineadas
        boolean sameRow = true, sameCol = true;
        int baseRow = shipCells.get(0)[0];
        int baseCol = shipCells.get(0)[1];

        for (int[] cell : shipCells) {
            if (cell[0] != baseRow) sameRow = false;
            if (cell[1] != baseCol) sameCol = false;
        }

        if (!sameRow && !sameCol) return -1; // no está en línea recta

        return shipCells.size();
    }


    private static boolean isShipIsolated(int[][] field, int row, int col) {
        for (int[] n : NEIGHBORS) {
            int newRow = row + n[0];
            int newCol = col + n[1];
            if (isInBounds(newRow, newCol) && field[newRow][newCol] == 1 &&
                    (newRow != row || newCol != col)) {
                if (Math.abs(newRow - row) + Math.abs(newCol - col) != 1) {
                    // si está en diagonal o tocando otro barco
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isInBounds(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }


}

