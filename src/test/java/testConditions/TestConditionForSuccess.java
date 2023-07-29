package testConditions;

import filters.Condition;

public class TestConditionForSuccess implements Condition {
    @Override
    public boolean validateForward() {
        return true;
    }
}
