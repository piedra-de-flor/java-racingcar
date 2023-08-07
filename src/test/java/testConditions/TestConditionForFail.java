package testConditions;

import medel.filters.Condition;

public class TestConditionForFail implements Condition {
    @Override
    public boolean validateForward() {
        return false;
    }
}
