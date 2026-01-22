package com.example.wastepickup.service;

import com.example.wastepickup.model.WastePickup;
import java.util.List;
import java.util.Optional;

public interface WastePickupReader {
    List<WastePickup> getAllWastePickups();
    Optional<WastePickup> getWastePickupById(Long id);
}
