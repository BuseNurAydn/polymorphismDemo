package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
	/*	EmailLogger logger = new EmailLogger();
		logger.log("Log mesajý");
		
		DatabaseLogger log = new DatabaseLogger();
		log.log("Database mesajý");*/
/*		
	BaseLogger[] logger= new BaseLogger[] {        //istediðimiz kadar loglama ortamý eklenebilir
	        new DatabaseLogger(),new FileLogger(),new EmailLogger()};
	    for(BaseLogger loggers : logger) {
	    	loggers.log("Loglandý.");
	}*/
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();  //Database içindeki log çalýþtý
		
		CustomerManager customerManager1 = new CustomerManager(new FileLogger());
		customerManager1.Add();  // file içindeki

	}

}
