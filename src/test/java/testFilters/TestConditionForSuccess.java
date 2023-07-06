package testFilters;

import filters.Conditions;

public class TestConditionForSuccess implements Conditions {
    @Override
    public boolean validateForward() {
        return true;
    }
}
