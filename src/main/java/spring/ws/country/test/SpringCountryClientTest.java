package spring.ws.country.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import spring.ws.country.GetCountryResponse;


public class SpringCountryClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CountryConfiguration.class, args);

		CountryClient Client = ctx.getBean(CountryClient.class);

		String country = "Spain";
		if (args.length > 0) {
			country = args[0];
		}
		GetCountryResponse wr = Client.getCountry(country);
		
		// print result
        System.out.println( "Country:" + wr.getCountry().getName() );  
        System.out.println( "Capital:" + wr.getCountry().getCapital());  
        System.out.println( "Population:" + wr.getCountry().getPopulation() );  
        System.out.println( "Currency:" + wr.getCountry().getCurrency() );  
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