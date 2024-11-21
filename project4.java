package com.bandiClasses.DMS.repository;
/*
 * s573376 Deepika Mukku
 */
import java.util.List;

/*
 * 
 * @S573376 Deepika Mukku
 * 
 * 
 */
import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String Name);

}
