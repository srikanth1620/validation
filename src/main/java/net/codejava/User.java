package net.codejava;


import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@Pattern(regexp = "^[a-z0-9_-]{3,15}$", message= "Username can be any combination of a-z or 0-9 or _ or - between 3 to 15 character length")
	private String name;

	@Pattern(regexp="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}", message = "Please enter a valid e-mail address")
	private String email;

	@Pattern(regexp="\\d{3}-\\d{2}-\\d{4}", message = "SSN should be in this format: 000-00-0000")
	private String ssn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", ssn=" + ssn + "]";
	}
	
	
}
