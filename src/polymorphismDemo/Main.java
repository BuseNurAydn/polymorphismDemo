package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
	/*	EmailLogger logger = new EmailLogger();
		logger.log("Log mesaj�");
		
		DatabaseLogger log = new DatabaseLogger();
		log.log("Database mesaj�");*/
/*		
	BaseLogger[] logger= new BaseLogger[] {        //istedi�imiz kadar loglama ortam� eklenebilir
	        new DatabaseLogger(),new FileLogger(),new EmailLogger()};
	    for(BaseLogger loggers : logger) {
	    	loggers.log("Logland�.");
	}*/
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();  //Database i�indeki log �al��t�
		
		CustomerManager customerManager1 = new CustomerManager(new FileLogger());
		customerManager1.Add();  // file i�indeki

	}

}
