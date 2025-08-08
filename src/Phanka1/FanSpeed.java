package Phanka1;
public enum FanSpeed {
    OFF, LOW, MEDIUM, HIGH;
    public FanSpeed increase() {
        return switch (this) {
            case OFF -> LOW;
            case LOW -> MEDIUM;
            case MEDIUM -> HIGH;
            case HIGH -> HIGH;
        };
    }
    public FanSpeed decrease() {
        return switch (this) {
            case HIGH -> MEDIUM;
            case MEDIUM -> LOW;
            case LOW -> LOW;
            case OFF -> OFF;
        };
    }
}