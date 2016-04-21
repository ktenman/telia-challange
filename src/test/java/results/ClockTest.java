package results;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockTest {

    private final Clock clock = new Clock();

    @Test
    public void degreeBetweenClockHands(){
        assertEquals(90, clock.degreeBetweenClockHands(3, 0));
        assertEquals(90, clock.degreeBetweenClockHands(15, 0));
        assertEquals(180, clock.degreeBetweenClockHands(6, 0));
        assertEquals(180, clock.degreeBetweenClockHands(18, 0));
        assertEquals(270, clock.degreeBetweenClockHands(21, 0));
        assertEquals(0, clock.degreeBetweenClockHands(0, 0));
        assertEquals(0, clock.degreeBetweenClockHands(24, 0));
        assertEquals(0, clock.degreeBetweenClockHands(12, 0));
        assertEquals(165, clock.degreeBetweenClockHands(12, 30));
        assertEquals(83, clock.degreeBetweenClockHands(12, 15));
        assertEquals(248, clock.degreeBetweenClockHands(12, 45));
        assertEquals(248, clock.degreeBetweenClockHands(0, 45));
        assertEquals(248, clock.degreeBetweenClockHands(24, 45));
        assertEquals(50, clock.degreeBetweenClockHands(14, 20));
        assertEquals(7, clock.degreeBetweenClockHands(3, 15));
        assertEquals(75, clock.degreeBetweenClockHands(20, 30));
    }
}
