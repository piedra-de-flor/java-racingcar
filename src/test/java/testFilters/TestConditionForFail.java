package testFilters;

import filters.Conditions;

public class TestConditionForFail implements Conditions {
    @Override
    public boolean validateForward() {
        return false;
    }
}
