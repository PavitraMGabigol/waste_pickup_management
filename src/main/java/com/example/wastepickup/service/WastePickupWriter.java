package com.example.wastepickup.service;

import com.example.wastepickup.model.WastePickup;

public interface WastePickupWriter {
    WastePickup saveWastePickup(WastePickup wastePickup);
    void deleteWastePickup(Long id);
}
