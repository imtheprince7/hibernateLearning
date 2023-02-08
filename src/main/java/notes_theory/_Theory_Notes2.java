package notes_theory;
public class _Theory_Notes2 {
/*
 		HIBERNATE_ CONFIGURATION
 		
 		-- Hibernate_framework connect with database, take object from application and save(in db).
 		--- Retrieve object from db and show us depend on needs.
 		--- It work internally [ Writting query of CRUD operation ]
 			
 		
 We make hibernate_configuration file to define/create Database confuguration.
	MySQL connection:[ DbName, url, user,password]
--- It's the easiest way to configure with database, We can also do with JavaClass.
	

------- Make an XML file parallel to "SRC" folder. [ it's parallel to package in "SRC" folder.
	Naming rule:---  hibernate.cfg.xml [ standard naming rule]
	what should we write in this cfg.xml
	--- 1. DTT of hibernate [ from internte] [ only <!DOCTYPE section>
	--- 2. Write all the code inside of 
			<hibernate-configuration>
			<session-factory>
			
// configuration of driver
 			<property name = "connection.drive_class"> com.mysql.jdbc.Driver </property>
// connection_URL
 			<property name = "connection.url">jdbc:mysql://localhost:3306/HibernateDB </property>
// UserName Declaration
  			<property name = "connection.username"> root </property>
 
// Password Declaration
 			<property name = "connection.password"> root </property>  
 
// dialect [ basically define which database query Hibernate has to perform.( mysql, oracle, msAccess)
 			<property name = "dialect"> org.hibernate.dialect.MySQLDialect </property>
			
// ddl- create type ( everyTime when it execute create a new table\ update the existing table
  			<property name = "hbm2ddl.auto"> update </property>

//show_sql [ show the written query on console]
  			<property name = "show_sql"> true </property>
 
 
 
			</session-factory>
			</hibernate-configuration>
			
			

	We map define class inside the session-factory.
	

	
	
 




*/
}
