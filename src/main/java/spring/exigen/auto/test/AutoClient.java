package spring.exigen.auto.test;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import spring.exigen.auto.DriverRisk;
import spring.exigen.auto.DriverRiskResponse;
import spring.exigen.auto.ObjectFactory;


public class AutoClient extends WebServiceGatewaySupport {


	public DriverRiskResponse getCountry(Integer a1) {
		// TODO Auto-generated method stub
//		ObjectFactory of = new ObjectFactory();
//		DriverRisk request = of.createDriverRisk();
//		JAXBElement<Integer> acc = of.createDriverRiskNumAccidents(1);
//		JAXBElement<Integer> dui = of.createDriverRiskNumDUI(1);
//		JAXBElement<Integer> mv = of.createDriverRiskNumMovingViolations(1);
//		
//		request.setNumAccidents(acc);
//		request.setNumDUI(dui);
//		request.setNumMovingViolations(mv);
		
		ObjectFactory of = new ObjectFactory();
		DriverRisk request = of.createDriverRisk();
		JAXBElement<Integer> arg0 = of.createDriverRiskArg0(1);
		JAXBElement<Integer> arg1 = of.createDriverRiskArg1(1);
		JAXBElement<Integer> arg2 = of.createDriverRiskArg2(1);
		
		request.setArg0(arg0);
		request.setArg1(arg1);
		request.setArg2(arg2);
//		DriverRisk request = new DriverRisk();
////		request.setArg0(new JAXBElement<Integer>(null, null, a1));
//		Integer one =1;
//		//dr..setNumAccidents(1);
//		JAXBElement<Integer> jaxbElement =  new JAXBElement( 
//	            new QName(Integer.class.getSimpleName()), Integer.class, one );
//		request.setArg0(jaxbElement);
//		request.setArg1(jaxbElement);
//		request.setArg2(jaxbElement);
		

		System.out.println();
		System.out.println("Requesting forecast for " + a1);

		DriverRiskResponse response0 = (DriverRiskResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		DriverRiskResponse response = (DriverRiskResponse) getWebServiceTemplate().marshalSendAndReceive(
				request,
				new SoapActionCallback(
						"http://dev2openldemo01.eqxdev.exigengroup.com/webservice/Example3-AutoPolicyCalculation/DriverRisk"));

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