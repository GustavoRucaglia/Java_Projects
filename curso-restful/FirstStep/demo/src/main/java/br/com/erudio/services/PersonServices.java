package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {
	
		private final AtomicLong counter = new AtomicLong();
		private Logger logger = Logger.getLogger(PersonServices.class.getName());
		
		public Person findById(String id) {
			
			
			  logger.info("Finding one person!");
			 Person person = new Person();
			 person.setId(counter.incrementAndGet());
			 person.setFirstName("gustavo");
			 person.setLastName("santiago");
			 person.setAddress("uberlandia");
			 person.setGenter("male");
			 return person;
		}
		
		public List<Person> findAll() {
			 logger.info("Finding all persons!");
				List<Person> persons = new ArrayList<>();
				
				for (int i = 0; i < 8; i++) {
				    Person person = mockPerson(i);
					persons.add(person);
				}
				
				return persons;
		}
		
		public Person create(Person person) {
			 logger.info("create person!");
			 
			 return person;
		}
		
		public Person update(Person person) {
			logger.info("update person!");
			
			return person;
		}
		
		public void delete(String id) {
			logger.info("delete one person!");
			
		}
		
		private Person mockPerson(int i) {
		
			  logger.info("Finding one person!");
			 Person person = new Person();
			 person.setId(counter.incrementAndGet());
			 person.setFirstName("gustavo" + i);
			 person.setLastName("santiago" + i);
			 person.setAddress("uberlandia" + i);
			 person.setGenter("male" + i);
			 return person;
		}
		
	}
