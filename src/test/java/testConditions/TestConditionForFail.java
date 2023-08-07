package testConditions;

import filters.Condition;

public class TestConditionForFail implements Condition {
    @Override
    public boolean validateForward() {
        return false;
    }
}
