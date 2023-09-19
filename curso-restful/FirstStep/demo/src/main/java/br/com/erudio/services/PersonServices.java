package br.com.erudio.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erudio.data.vo.v1.PersonVO;
import br.com.erudio.data.vo.v2.PersonVOV2;
import br.com.erudio.excpetions.ResorceNotFound;
import br.com.erudio.mapper.DozerMapper;
import br.com.erudio.mapper.custom.PersonMapper;
import br.com.erudio.model.Person;
import br.com.erudio.repository.PersonRepository;

@Service
public class PersonServices {

		
		private Logger logger = Logger.getLogger(PersonServices.class.getName());
		
		@Autowired
		PersonRepository repository;
		
		@Autowired
		PersonMapper mapper;
		
		public PersonVO findById(Long id) {
			
			
			  logger.info("Finding one PersonVO!");
		
			 
			 var entity = repository.findById(id).orElseThrow(() -> new ResorceNotFound("no records found for this id"));
			 return DozerMapper.parseObject(entity, PersonVO.class);
		}
		
		public List<PersonVO> findAll() {
			
			 logger.info("Finding all PersonVOs!");
				return DozerMapper.parseListObjects(repository.findAll(), PersonVO.class);
		}
		
		public Person create(Person person) {
			 logger.info("create PersonVO!");
			 return repository.save(person);
		}
		
		public Person update(Person person) {
			logger.info("update PersonVO!");
			
			var entity = repository.findById(person.getId()).orElseThrow(() -> new ResorceNotFound("no records found for this id"));
			
			entity.setFirstName(person.getFirstName());
			entity.setLastName(person.getLastName());
			entity.setAddress(person.getAddress());
			entity.setGender(person.getGender());
			
			return repository.save(entity);
		}
		
		public void delete(Long id) {
			logger.info("delete one PersonVO!");
			
			var entity = repository.findById(id).orElseThrow(() -> new ResorceNotFound("no records found for this id"));
			repository.delete(entity);
		}

		public PersonVOV2 createV2(PersonVOV2 person) {
			 logger.info("create PersonVO!");
			 
			 var entity = mapper.convertVoToEntity(person);
			 var vo = mapper.convertEntityToVo(repository.save(entity));
				return vo;
			}  
			
		}
