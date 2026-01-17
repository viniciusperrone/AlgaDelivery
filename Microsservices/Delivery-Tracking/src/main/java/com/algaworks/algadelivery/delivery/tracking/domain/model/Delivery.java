package com.algaworks.algadelivery.delivery.tracking.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Delivery {
    private UUID id;
    private UUID courierId;

    private DeliveryStatus status;

    private OffsetDateTime placeAt;
    private OffsetDateTime assignedAt;
    private OffsetDateTime expectedAt;
    private OffsetDateTime fulfilledAt;

    private BigDecimal distanceFee;
    private BigDecimal courierPayout;
    private BigDecimal totalCost;

    private Integer totalItems;

    private List<Item> items = new ArrayList<>();
}
