package ProffesorCodes.Lesson4;

class Person implements Cloneable   
{  
//Lower-level object  

	private Car objcar;  
	
	
private String name; 


	public Car getCar()   
{  
return objcar;  
}  
	
	
	
	
	
	public String getName()   
{  
		return name;  
}  
public void setName(String s)   
{  
name = s;  
}  
	public Person(String s, String t)   
{  
		name = s;  
	objcar = new Car(t);  
}  
	
	
	public Object clone()   
{  
//shallow copy  
		try   
		{  
			return super.clone();  
		}   
catch (CloneNotSupportedException e)   
{  
return null;  
}  
}  
}  




class Car   
{  
private String name;  
public String getName()   
{  
return name;  
}  
public void setName(String s)   
{  
name = s;  
}  
public Car(String s)   
{  
name = s;  
}  
}  
