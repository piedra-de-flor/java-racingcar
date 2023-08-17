package testConditions;

import medel.service.filter.Condition;

public class TestConditionForSuccess implements Condition {
    @Override
    public boolean validateForward() {
        return true;
    }
}
