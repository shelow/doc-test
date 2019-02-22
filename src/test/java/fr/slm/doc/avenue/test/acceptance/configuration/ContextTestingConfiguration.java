package fr.slm.doc.avenue.test.acceptance.configuration;

import cucumber.api.java8.En;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        ExternalServiceConfiguration.class
})
public class ContextTestingConfiguration implements En {
}
