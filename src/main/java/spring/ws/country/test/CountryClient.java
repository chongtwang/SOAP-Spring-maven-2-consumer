package spring.ws.country.test;

import java.text.SimpleDateFormat;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import spring.ws.country.GetCountryRequest;
import spring.ws.country.GetCountryResponse;
import spring.ws.weather.Forecast;
import spring.ws.weather.ForecastReturn;
import spring.ws.weather.GetCityForecastByZIPResponse;
import spring.ws.weather.Temp;

public class CountryClient extends WebServiceGatewaySupport {


	public GetCountryResponse getCountry(String country) {
		// TODO Auto-generated method stub
		GetCountryRequest request = new GetCountryRequest();
		request.setName(country);;

		System.out.println();
		System.out.println("Requesting forecast for " + country);

		GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(
				request,
				new SoapActionCallback(
						"http://localhost:8181/ws/getCountry"));

		return response;
	}

//	public void printResponse(GetCityForecastByZIPResponse response) {
//		ForecastReturn forecastReturn = response.getGetCityForecastByZIPResult();
//
//		if (forecastReturn.isSuccess()) {
//			System.out.println();
//			System.out.println("Forecast for " + forecastReturn.getCity() + ", "
//					+ forecastReturn.getState());
//
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//			for (Forecast forecast : forecastReturn.getForecastResult().getForecast()) {
//				System.out.print(format.format(forecast.getDate().toGregorianCalendar().getTime()));
//				System.out.print(" ");
//				System.out.print(forecast.getDesciption());
//				System.out.print(" ");
//				Temp temperature = forecast.getTemperatures();
//				System.out.print(temperature.getMorningLow() + "\u00b0-"
//						+ temperature.getDaytimeHigh() + "\u00b0 ");
//				System.out.println();
//			}
//		} else {
//			System.out.println("No forecast received");
//		}
//	}

}