package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		
		StepDefinition m = new StepDefinition();
		if(StepDefinition.place_id==null) {
			m.add_place_payload_with("Prajwal", "English", "Germany");
			m.user_calls_with_post_http_request("AddPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("Prajwal", "getPlaceAPI");
		}
	
	}
}
