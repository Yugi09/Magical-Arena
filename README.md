# Magical-Arena
To run the code, simply create an instance of the `Arena` class and call the `simulateMatch` method.

Example:
```java
public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        arena.simulateMatch();
    }
}
