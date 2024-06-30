public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice attackingDice;
    private Dice defendingDice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackingDice = new Dice();
        this.defendingDice = new Dice();
    }

    public void simulateMatch() {
        Match match = new Match(playerA, playerB, attackingDice, defendingDice);
        match.play();
    }
}
