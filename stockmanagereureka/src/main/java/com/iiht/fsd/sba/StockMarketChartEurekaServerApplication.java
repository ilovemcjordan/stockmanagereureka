package com.iiht.fsd.sba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StockMarketChartEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketChartEurekaServerApplication.class, args);
	}

}
