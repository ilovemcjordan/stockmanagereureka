package snippet;

public class Snippet {
	server.port=8761
	
	#telling the server not to register himself in the service
	eureka.client.register-with-eureka=false
	#Eureka clients fetch the service registry (ServiceInstance: {URL, PORT, HOST}) from the Eureka server
	eureka.client.fetch-registry=false
	
}

