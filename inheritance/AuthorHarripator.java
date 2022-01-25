package inheritance;

public class AuthorHarripator {
private String name,email;
private char gender;
AuthorHarripator(String name,String email,char gender)
{
	this.name=name;
	this.email=email;
	this.gender=gender;
}
public void setName(String name) 
{
	this.name = name;
}
public String getName()
{
	return name;
}
public void setEmail(String email) 
{
	this.email = email;
}
public String getEmail() 
{
	return email;
}
public void setGender(char gender) 
{
	this.gender = gender;
}
public char getGender()
{
	return gender;
}

}
