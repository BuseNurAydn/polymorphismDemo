package polymorphismDemo;

public class CustomerManager {
	
	  private BaseLogger logger ; //ba��ml�l��� gidermek i�in //burda anne class ile �al���yorz
	     
	   public  CustomerManager(BaseLogger logger) {
			this.logger = logger;
	    	
	    }
	   public void Add() {
		   System.out.println("M��teri eklendi.");
		   this.logger.log("Log mesaj�");
		
	//	DatabaseLogger logger = new DatabaseLogger(); //bir class� ba�ka bir class�n i�inde new yapmak
	//	logger.log("Log mesaj�");                     // demek yani burada database ba��ml� oldu
	// kimin ekledi�ini g�stermek i�in yaz�l�r normalde                                              
	// database yerine file loglama yap�lacak dendi�inde her yerden bunu silmek gerekecek
		   //bunun olmas�n� istemeyiz

	}


}
