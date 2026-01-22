
package com.example.wastepickup.service;

import com.example.wastepickup.factory.FilterStrategyFactory;
import com.example.wastepickup.model.WastePickup;
import com.example.wastepickup.repository.WastePickupRepository;
import com.example.wastepickup.strategy.FilterStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("filteredService")
public class FilteredWastePickupServiceImpl implements WastePickupServiceInterface {

    @Autowired
    private WastePickupRepository wastePickupRepository;

    @Override
    public List<WastePickup> getAllWastePickups() {
        // Factory Pattern used here to get filtering strategy
        FilterStrategy strategy = FilterStrategyFactory.getStrategy("status");
        return strategy.filter(wastePickupRepository.findAll());
    }

    @Override
    public Optional<WastePickup> getWastePickupById(Long id) {
        return wastePickupRepository.findById(id);
    }

    @Override
    public WastePickup saveWastePickup(WastePickup wastePickup) {
        return wastePickupRepository.save(wastePickup);
    }

    @Override
    public void deleteWastePickup(Long id) {
        wastePickupRepository.deleteById(id);
    }
}
