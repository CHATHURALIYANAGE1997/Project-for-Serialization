package Serialization.Serialization;

import Serialization.Serialization.model.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class SerializationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerializationApplication.class, args);
		Data object = new Data(1, "Project for Serialization");
		String filename ="text.txt";

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

		}catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


		Data object1 = null;

		// Deserialization
		try
		{
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (Data)in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

	}

}
