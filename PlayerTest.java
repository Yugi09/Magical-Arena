import org.junit.Test;

public class PlayerTest {
    @Test
    public void testGetHealth() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
    }

    @Test
    public void testSetHealth() {
        Player player = new Player(50, 5, 10);
        player.setHealth(20);
        assertEquals(20, player.getHealth());
    }
}
