package polymorphismDemo;

public class CustomerManager {
	
	  private BaseLogger logger ; //baðýmlýlýðý gidermek için //burda anne class ile çalýþýyorz
	     
	   public  CustomerManager(BaseLogger logger) {
			this.logger = logger;
	    	
	    }
	   public void Add() {
		   System.out.println("Müþteri eklendi.");
		   this.logger.log("Log mesajý");
		
	//	DatabaseLogger logger = new DatabaseLogger(); //bir classý baþka bir classýn içinde new yapmak
	//	logger.log("Log mesajý");                     // demek yani burada database baðýmlý oldu
	// kimin eklediðini göstermek için yazýlýr normalde                                              
	// database yerine file loglama yapýlacak dendiðinde her yerden bunu silmek gerekecek
		   //bunun olmasýný istemeyiz

	}


}
