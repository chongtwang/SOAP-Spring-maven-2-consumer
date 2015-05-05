package spring.exigen.auto.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import spring.exigen.auto.DriverRiskResponse;



public class SpringAutoClientTest {

	public static void main(String[] args) {

// generate log
    	System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
    	System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
    	System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
    	System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

		
		
		ApplicationContext ctx = SpringApplication.run(AutoConfiguration.class, args);

		AutoClient Client = ctx.getBean(AutoClient.class);

		DriverRiskResponse wr = Client.getCountry(1);
		
		// print result
//        System.out.println( "Country:" + wr.getCountry().getName() );  
//        System.out.println( "Capital:" + wr.getCountry().getCapital());  
//        System.out.println( "Population:" + wr.getCountry().getPopulation() );  
//        System.out.println( "Currency:" + wr.getCountry().getCurrency() );  
	}

}

//public class Application {
//
//	public static void main(String[] args) {
////		ApplicationContext ctx = SpringApplication.run(WeatherConfiguration.class, args);
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(WeatherConfiguration.class);
//        ctx.refresh();
//
//		WeatherClient weatherClient = ctx.getBean(WeatherClient.class);
//
//		String zipCode = "08820";
//		if (args.length > 0) {
//			zipCode = args[0];
//		}
//		GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
//		weatherClient.printResponse(response);
//	}
//
//}