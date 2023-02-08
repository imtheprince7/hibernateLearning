package notes_theory;
public class Annotations {
/*	
			ANNOTATION
 The hibernate application can be created with annotation

 Annotations 			   Use of annotations

 @Entity 			Used for declaring any POJO class as an entity(tableName) for a database
 @Table				Used to change table details, some of the attributes are-
 					       name – override the table name
 					       schema ,Catalogue,
 					       enforce unique constraints

 @Id				Used for declaring a primary key inside our POJO class
 @GeneratedValue	Hibernate automatically generate the values with reference to the internal sequence and we don’t need to set the values manually.
 @Column			It is used to specify column mappings. It means if in case we don’t need the name of the column that we declare in POJO
 			    	but we need to refer to that entity you can change the name for the database table. Some attributes are-
						   Name – We can change the name of the entity for the database
    					   length – the size of the column mostly used in strings
    					   unique – the column is marked for containing only unique values
    					   nullable – The column values should not be null. It’s marked as NOT

 @Transient			Tells the hibernate, not to add this particular column
 @Temporal			This annotation is used to format the date for storing in the database
 @Lob				Used to tell hibernate that it’s a large object and is not a simple object
 @OrderBy			This annotation will tell hibernate to OrderBy as we do in SQL.
 					eg:– we need to order by student firstname in ascending order
						   @OrderBy(“firstname asc”)
						   
 
 @OneToOne, @OneToMany,  @ManyToOne   @ManyToMany   @JoinColumn, etc














*/
}
