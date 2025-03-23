package arraysandstrings.array.client;

import arraysandstrings.array.CellCompetitionProblem;

import java.util.Arrays;

public class CellCompetitionProblemClient {
    public static void main(String[] args) {
        int [] states = {0, 1, 0, 1, 0, 1, 0, 1};
        int k = 3;
        System.out.println(Arrays.toString(CellCompetitionProblem.cellCompete(states,k)));
    }
}
