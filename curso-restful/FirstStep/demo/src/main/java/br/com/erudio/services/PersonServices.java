package br.com.erudio.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erudio.excpetions.ResorceNotFound;
import br.com.erudio.model.Person;
import br.com.erudio.repository.PersonRepository;

@Service
public class PersonServices {

		
		private Logger logger = Logger.getLogger(PersonServices.class.getName());
		
		@Autowired
		PersonRepository repository;
		
		public Person findById(Long id) {
			
			
			  logger.info("Finding one person!");
		
			 
			 return repository.findById(id).orElseThrow(() -> new ResorceNotFound("no records found for this id"));
		}
		
		public List<Person> findAll() {
			
			 logger.info("Finding all persons!");
			
				return repository.findAll();
		}
		
		public Person create(Person person) {
			 logger.info("create person!");
			 
			 return repository.save(person);
		}
		
		public Person update(Person person) {
			logger.info("update person!");
			
			var entity = repository.findById(person.getId()).orElseThrow(() -> new ResorceNotFound("no records found for this id"));
			
			entity.setFirstName(person.getFirstName());
			entity.setLastName(person.getLastName());
			entity.setAddress(person.getAddress());
			entity.setGenter(person.getGenter());
			
			return repository.save(entity);
		}
		
		public void delete(Long id) {
			logger.info("delete one person!");
			
			var entity = repository.findById(id).orElseThrow(() -> new ResorceNotFound("no records found for this id"));
			repository.delete(entity);
		}
		
		
	}
