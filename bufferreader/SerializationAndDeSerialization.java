package bufferreader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeSerialization implements Serializable 
{
	public int a;
    public  String b;
  
    // Default constructor
    public SerializationAndDeSerialization(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
	public static void main(String[] args) 
	{
		SerializationAndDeSerialization object = new SerializationAndDeSerialization(1, "geeksforgeeks");
        String filename = "file.ser";
          
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(object);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        SerializationAndDeSerialization object1 = null;
  
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            object1 = (SerializationAndDeSerialization)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
  
    }
		 

	}

