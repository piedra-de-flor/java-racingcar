package testConditions;

import medel.filters.Condition;

public class TestConditionForSuccess implements Condition {
    @Override
    public boolean validateForward() {
        return true;
    }
}
