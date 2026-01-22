
package com.example.wastepickup.strategy;

import com.example.wastepickup.model.WastePickup;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByStatusStrategy implements FilterStrategy {
    @Override
    public List<WastePickup> filter(List<WastePickup> pickups) {
        return pickups.stream()
                .filter(pickup -> !"COMPLETED".equalsIgnoreCase(pickup.getStatus()))
                .collect(Collectors.toList());
    }
}
