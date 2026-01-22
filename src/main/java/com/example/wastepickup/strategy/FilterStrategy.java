
package com.example.wastepickup.strategy;

import com.example.wastepickup.model.WastePickup;

import java.util.List;

public interface FilterStrategy {
    List<WastePickup> filter(List<WastePickup> pickups);
}
