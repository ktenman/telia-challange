package results;

public class Clock implements IClock {

    public int degreeBetweenClockHands(int hour, int minute) {
        hour = hour % 12;
        int hourDegree = hour * 360 / 12 + (int) ((360 / 12) * (minute / 60.0));
        int minuteDegree = minute * 360 / 60;
        return Math.abs(hourDegree - minuteDegree);
    }
}
