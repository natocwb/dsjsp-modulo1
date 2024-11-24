package com.nato.dsjsp_modulo1.services;

import com.nato.dsjsp_modulo1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }
    public double total(Order order) {
        return (order.getBasic() -((order.getBasic()/100) * order.getDiscount())) + shippingService.shipment(order);
    }
}
