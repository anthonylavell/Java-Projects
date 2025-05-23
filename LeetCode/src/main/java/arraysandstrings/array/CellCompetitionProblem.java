package arraysandstrings.array;

public class CellCompetitionProblem {
    public static int[] cellCompete(int[] states, int days) {
        // if the number of cells is not equals to 8
        // or number of days is less than 1
        /*if (states.length != 8 || days < 1) {
            return states;
        }*/

        // local variables
        int index, previousValue, nextValue;

        // loop for each day
        for (int i = 0; i < days; i++) {
            // index of current cell
            index = 0;
            // value of the previous cell
            previousValue = 0;
            // value of the next cell
            nextValue = 0;

            // loop for each cell in the array
            while (index < states.length) {
                // if the current index is not last index of the given array,
                // set the value of nextValue, else it would remain 0.
                if (index < states.length - 1) {
                    nextValue = states[index + 1];
                }

                // if nextValue is same as previousValue
                if (nextValue == previousValue) {
                    // save the current index value for next iteration of loop
                    previousValue = states[index];
                    // set current index value
                    states[index] = 0;
                } else {
                    // save the current index value for next iteration of loop
                    previousValue = states[index];
                    // set current index value
                    states[index] = 1;
                }

                // next item in the loop
                index++;
            }
        }

        // return states array
        return states;
    }
}
