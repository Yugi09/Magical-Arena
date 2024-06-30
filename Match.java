public class Match {
    private Player playerA;
    private Player playerB;
    private Dice attackingDice;
    private Dice defendingDice;

    public Match(Player playerA, Player playerB, Dice attackingDice, Dice defendingDice) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackingDice = attackingDice;
        this.defendingDice = defendingDice;
    }

    public void play() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            int attackRoll = attackingDice.roll();
            int defendRoll = defendingDice.roll();

            int attackDamage = attacker.getAttack() * attackRoll;
            int defendStrength = defender.getStrength() * defendRoll;

            int damageDealt = Math.max(0, attackDamage - defendStrength);
            defender.setHealth(defender.getHealth() - damageDealt);

            System.out.println(String.format("Attacker: %s, Defender: %s, Attack Roll: %d, Defend Roll: %d, Damage Dealt: %d",
                    attacker == playerA ? "A" : "B", defender == playerA ? "A" : "B", attackRoll, defendRoll, damageDealt));

            // Switch attacker and defender
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println(String.format("Match ended. Winner: %s", playerA.getHealth() > 0 ? "A" : "B"));
    }
}
