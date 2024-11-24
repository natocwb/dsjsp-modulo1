package com.nato.dsjsp_modulo1;

import com.nato.dsjsp_modulo1.entities.Order;
import com.nato.dsjsp_modulo1.services.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsjspModulo1Application implements CommandLineRunner{

	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(DsjspModulo1Application.class, args);
	}

	public DsjspModulo1Application(OrderService orderService) {
		this.orderService = orderService;
	}
	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido codigo " + order.getCode() + "/n Valor total " + orderService.total(order));
	}
}
