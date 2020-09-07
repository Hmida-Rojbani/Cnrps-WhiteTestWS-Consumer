package tn.cnrps.ws.soap.white.cons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller =new Jaxb2Marshaller();
		marshaller.setPackagesToScan("tn.cnrps.ws.soap.consume.WhiteTestsClasses");
		return marshaller;
	}

}
