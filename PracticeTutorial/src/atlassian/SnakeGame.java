package atlassian;

import java.util.ArrayDeque;
import java.util.Queue;

public class SnakeGame {
    int width, height, row, col, count, food[][];
    Queue<int[]> snake = new ArrayDeque<>();

    public SnakeGame(int width, int height, int[][] food) {
        this.width = width;
        this.height = height;
        this.food = food;
        snake.add(new int[2]);
    }

    public int move(String direction) {
        switch (direction.charAt(0)) {
            case 'D' -> row++;
            case 'U' -> row--;
            case 'R' -> col++;
            case 'L' -> col--;
        }

        if (row < 0 || row == height || col < 0 || col == width)
            return -1;

        if (count < food.length &&
                row == food[count][0] && col == food[count][1]) {
            count++;
        }
        else {
            snake.poll();
            for (int[] s : snake)
                if (s[0] == row && s[1] == col)
                    return -1;
        }

        snake.add(new int[]{row, col});
        return snake.size() - 1;
    }
}
