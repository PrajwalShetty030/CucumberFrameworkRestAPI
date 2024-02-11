package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayLoad(String name, String language, String address) {
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("9740898398");
		p.setWebsite("test@test.test");
		p.setName(name);
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("car park");
		p.setTypes(myList);
		
		Location l = new Location();
		l.setLat(33.3232);
		l.setLng(-32.323);
		p.setLocation(l);
		return p;
	}

	public String deletePlacePayload(String place_id) {
		return "{\r\n		\"place_id\":\""+place_id+"\"\r\n}";
	}
}
