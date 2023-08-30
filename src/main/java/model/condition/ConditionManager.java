package model.condition;

public class ConditionManager {
    private final Condition condition;

    public ConditionManager() {
        this.condition = new RandomNumberCondition();
    }

    public Condition getCondition() {
        return condition;
    }
}
