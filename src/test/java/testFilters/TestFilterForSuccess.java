package testFilters;

import filters.CarFilter;

public class TestFilterForSuccess implements CarFilter {
    @Override
    public boolean validateForward() {
        return true;
    }
}
