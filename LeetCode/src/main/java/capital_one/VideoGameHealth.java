/**
 * Applies each health delta in sequence, clamping the health to [0, 100] after each change.
 *
 * @param initialHealth the starting health value
 * @param deltas        array of health changes per level
 * @return the final health after applying all deltas
 */
package capital_one;

public class VideoGameHealth {
    public static void main(String[] args) {
        int initialHealth = 12;
        int[] deltas = { -4, -12, 6, 2 };

        int finalHealth = health(initialHealth, deltas);
        System.out.println("Final Health: " + finalHealth);
    }

    public static int health(int initialHealth, int[] deltas) {
        int currentHealth = initialHealth;
        for (int delta : deltas) {
            currentHealth += delta;
            if (currentHealth < 0) {
                currentHealth = 0;
            } else if (currentHealth > 100) {
                currentHealth = 100;
            }
        }
        return currentHealth;
    }
}
