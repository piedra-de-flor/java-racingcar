package testConditions;

import medel.service.filter.Condition;

public class TestConditionForFail implements Condition {
    @Override
    public boolean validateForward() {
        return false;
    }
}
