package spring.exigen.auto.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class AutoConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("spring.exigen.auto");
		return marshaller;
	}

	@Bean
	public AutoClient autoClient(Jaxb2Marshaller marshaller) {
		AutoClient client = new AutoClient();
		client.setDefaultUri("http://dev2openldemo01.eqxdev.exigengroup.com/webservice/Example3-AutoPolicyCalculation?wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}