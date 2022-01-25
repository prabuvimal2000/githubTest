package mongodb;

import java.util.ArrayList;
import java.util.Arrays;

import org.bson.Document;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class FirstExample {
	public static void main(String[] args) 
	{
		// we are unable to use like this MongoClient mongoclient = new MongoClient();
		MongoClient mongoClient = MongoClients.create();
		System.out.println("Connected sucessfully");
		//MongoIterable<String> dbNames=mongoClient.listDatabaseNames();
	    //dbNames.forEach(doc->System.out.println(doc));
	    //MongoDatabase mongoDb=mongoClient.getDatabase("Fullstack developers");
	    //mongoDb.createCollection("emp_details");
	   /* MongoDatabase mongoDb = mongoClient.getDatabase("Developers");
	    //mongoDb.createCollection("fresher_details");
	  /*  Document doc= new Document("emp_id",5)
	    		.append("emp_name","vimal")
	    		.append("emp_adddress",Arrays.asList(new Document("Temperory_address",
	    				new Document("door no",9)
	    				.append("street","Ellai thottam road")
	    				.append("city","pollachi")
	    				.append("State", "Tamilnadu")
	    				.append("pincode",641014)),
	    				new Document("Primary_address",
	    				new Document("door no",7)
	    				.append("street","kumaran street")
	    				.append("city","salem")
	    				.append("State", "Tamilnadu")
	    				.append("pincode",641026))))
	    		.append("skills learned",Arrays.asList("Html","Angular js"));
	  Document doc1= new Document("emp_id",10)
	    		.append("emp_name","vasanth")
	    		.append("emp_adddress",Arrays.asList(new Document("Temperory_address",
	    				new Document("door no",7)
	    				.append("street","Ramaswamy layout,Ellai thottam road")
	    				.append("city","coimbatore")
	    				.append("State", "Tamilnadu")
	    				.append("pincode",641004)),
	    				new Document("Primary_address",
	    				new Document("door no",7)
	    				.append("street","Ramaswamy layout,Ellai thottam road")
	    				.append("city","kannur")
	    				.append("State", "kerala")
	    				.append("pincode",641006))))
	    		.append("skills learned",Arrays.asList("Frontend","backend"));
	     ArrayList<Document> list = new ArrayList<Document>();
	     list.add(doc);
	     list.add(doc1);*/
	    //MongoCollection<Document> collection=mongoDb.getCollection("fresher_details");
	    //collection.insertMany(list);
	   // collection.updateOne(Filters.eq("emp_name","vimal"),Updates.set("skills learned.0","java"));
	   //collection.updateOne(Filters.eq("emp_name","vasanth"),Updates.set("emp_adddress.1.Primary_address.city","malapula"));
	  // collection.updateOne(Filters.eq("emp_name","vasanth"),Updates.set("emp_adddress.1.Primary_address.city","mangalur"));
	   // collection.deleteOne(Filters.eq("emp_adddress.1.Primary_address.city","mangalur"));
	    // collection.updateOne(Filters.eq("emp_name", "vimal"), Updates.set("skills learned", "html","backend");
	    //collection.deleteOne(Filters.eq("skills learned[1]","java"));
	   // collection.updateOne(Filters.eq("emp_name","vimal"),Updates.unset("emp_adddress.1.Primary_address.city"));
	   // MongoIterable<Document> document=collection.find();
	    //document.forEach(docs->System.out.println(docs.toJson()));
	   // mongoDb.createCollection("emp_details")
	    //dbNames.forEach(doc->System.out.println(doc));
	    /*Document doc= new Document("emp_id","2")
	    		.append("emp_name", "prabu")
	    		.append("emp_role","Java full stack developer");
	    MongoCollection<Document> collection=mongoDb.getCollection("emp_details");
	    collection.insertOne(doc);
	    /*MongoCollection<Document> collection=mongoDb.getCollection("emp_details");
	    Document doc= new Document();
	    ArrayList<Document> list = new ArrayList<Document>();
	    list.add(new Document("emp_id","1")
	    		.append("emp_name", "vimal")
	    		.append("emp_role","Java full stack developer"));
	    list.add(new Document("emp_id","3")
	    		.append("emp_name", "vimal")
	    		.append("emp_role","Java full stack developer"));
	    list.add(new Document("emp_id","4")
	    		.append("emp_name", "niki")
	    		.append("emp_role","Java full stack developer"));
	    list.add(new Document("emp_id","5")
	    		.append("emp_name", "vimal")
	    		.append("emp_role","Java full stack developer"));
	    list.add(new Document("emp_id","6")
	    		.append("emp_name", "nithish")
	    		.append("emp_role","Java Tester"));
	    collection.insertMany(list);*/
	   // collection.updateMany(new Document("emp_namae","vimal"),new Document("$set",new Document("emp_name","vimalkumar")));
	   //collection.updateOne(new Document("emp_id","1"),new Document("$set",new Document("emp_name","vimalkumar")));
	   // collection.updateOne(Filters.eq("emp_name", "vimalkumar"), Updates.set("emp_name", "vimal"));
	    //collection.deleteOne(Filters.eq("emp_name", "vimal"));
         //collection.deleteMany(Filters.eq("emp_id",10));
	  // MongoIterable<Document> document=collection.find();
	    //document.forEach(docs->System.out.println(docs.toJson()));
		
		//math and group
		MongoDatabase mongoDb = mongoClient.getDatabase("Developers");
	    //mongoDb.createCollection("customer_details");
	    Document doc= new Document("customer_id",2)
	    		.append("customer_name","vimal")
	    		.append("amountpaid", 300);
	    MongoCollection<Document> collection=mongoDb.getCollection("customer_details");
	    collection.insertOne(doc);
	    MongoIterable<Document> document=collection.find();
	    document.forEach(docs->System.out.println(docs.toJson()));
	}
}
