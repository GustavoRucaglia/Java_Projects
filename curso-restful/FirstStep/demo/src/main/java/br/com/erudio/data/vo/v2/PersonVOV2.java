package br.com.erudio.data.vo.v2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;



public class PersonVOV2 implements Serializable{

	private static final long serialVersionUID = 1L;
		
		
		private Long id;
		private String firstName;
		private String lastName;
		private String address;
		private String genter;
		
		private Date birthDay;
		
		public PersonVOV2() {
		}
           
		public String getFirstName() {
			return firstName;
		}
		
		public Date getBirthDay() {
			return birthDay;
		}

		public void setBirthDay(Date date) {
			this.birthDay = date;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getGenter() {
			return genter;
		}

		public void setGenter(String genter) {
			this.genter = genter;
		}
		
		

		public void setId(Long id) {
			this.id = id;
		}

		public Long getId() {
			return id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PersonVOV2 other = (PersonVOV2) obj;
			return Objects.equals(id, other.id);
		}

	    
		
		

}
