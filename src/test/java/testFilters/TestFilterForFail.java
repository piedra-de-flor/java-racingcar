package testFilters;

import filters.CarFilter;

public class TestFilterForFail implements CarFilter {
    @Override
    public boolean validateForward() {
        return false;
    }
}
