package br.com.erudio.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.erudio.data.vo.v2.PersonVOV2;
import br.com.erudio.model.Person;

@Service
public class PersonMapper {
		
		public PersonVOV2 convertEntityToVo(Person person) {
				PersonVOV2 vo = new PersonVOV2();
				vo.setId(person.getId());
				vo.setBirthDay(new Date());
				vo.setFirstName(person.getFirstName());
				vo.setLastName(person.getLastName());
				vo.setGenter(person.getGender());
				vo.setAddress(person.getAddress());
				
				return vo;
		}
		
		public Person convertVoToEntity(PersonVOV2 person) {
			Person entity= new Person();
			entity.setId(person.getId());
			entity.setFirstName(person.getFirstName());
			entity.setLastName(person.getLastName());
			entity.setGender(person.getGenter());
			entity.setAddress(person.getAddress());
			
			return entity;
	}
}
