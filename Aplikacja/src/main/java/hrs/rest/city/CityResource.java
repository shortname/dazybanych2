package hrs.rest.city;

import hrs.database.city.City;
import hrs.database.city.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// For development only
@RestController
@RequestMapping("/city")
public class CityResource {

    @Autowired
    private CityRepo cityRepo;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<City> getCities(){
        return cityRepo.findAll();
    }

}
