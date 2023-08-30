package testConditions;

import model.condition.Condition;

public class TestConditionForFail implements Condition {
    @Override
    public boolean validateForward() {
        return false;
    }
}
