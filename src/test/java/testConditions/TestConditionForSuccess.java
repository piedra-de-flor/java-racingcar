package testConditions;

import model.condition.Condition;

public class TestConditionForSuccess implements Condition {
    @Override
    public boolean validateForward() {
        return true;
    }
}
