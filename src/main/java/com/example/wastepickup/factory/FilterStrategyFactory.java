
package com.example.wastepickup.factory;

import com.example.wastepickup.strategy.FilterByStatusStrategy;
import com.example.wastepickup.strategy.FilterStrategy;

public class FilterStrategyFactory {
    public static FilterStrategy getStrategy(String type) {
        if ("status".equalsIgnoreCase(type)) {
            return new FilterByStatusStrategy();
        }
        throw new IllegalArgumentException("Unknown strategy type: " + type);
    }
}
 