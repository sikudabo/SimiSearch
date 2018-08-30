package com.simi.MySQL.com.send.data.toMySQL;
import java.util.*;
import java.lang.*;
import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class HighSchoolData {
	/*Create static properties that will store the names of each high school that we retrieved from our 
	 *sparql query. We will loop through the JSON data and continue to add to each arraylist on each iteration
	 *until we have the name for each high school added to our arraylists. 
	 */
	public static ArrayList<String> highSchoolNames_0_1000 = new ArrayList<String>();
	public static ArrayList<String> highSchoolAbstracts = new ArrayList<String>();
	
	//Create a map to store the high school name and abstract data. Make it static in order to call it in the static methods().
	public static Map<String, String> highschoolsMap = new HashMap<String, String>();
	
	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/knowledgebase";
	
	//Database credentials
	static final String USER = "simi";
	static final String PASS = "AmazonApples2018";
	
	public static void getSchools() {
		/*Docstring: This method will allow us to pull each school and abstract from the .JSON document and store it in the 
		 * ArrayList and the Map. In our Map the name of school will be the key, and the abstract will be the value. 
		 */
		
		//Create paths to each of the .JSON documents that store the high school names and abstracts. 
		String path1 = "C://Users//Zookeeper//Downloads//highschools_0_1000_official.json";
		String path2 = "C://Users//Zookeeper//Downloads//highschools_1001_2001_official.json";
		String path3 = "C://Users//Zookeeper//Downloads//highschools_2001_3001_official.json";
		String path4 = "C://Users//Zookeeper//Downloads//highschools_3001_4001_official.json";
		String path5 = "C://Users//Zookeeper//Downloads//highschools_4001_5001_official.json";
		String path6 = "C://Users//Zookeeper//Downloads//highschools_5001_6001_official.json";
		String path7 = "C://Users//Zookeeper//Downloads//highschools_6001_7001_official.json";
		String path8 = "C://Users//Zookeeper//Downloads//highschools_7001_8001_official.json";
		String path9 = "C://Users//Zookeeper//Downloads//highschools_8001_9001_official.json";
		//-------------------------------------------------------------------------------------------------------------------------
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path1));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path2));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path3));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path4));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path5));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path6));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path7));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				
					
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path8));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			JSONParser parser1 = new JSONParser();
			Object obj1 = parser1.parse(new FileReader(path9));
			
			JSONObject jsonObj1 = (JSONObject) obj1;
			JSONObject jsonObjj1 = (JSONObject) jsonObj1.get("results");
			JSONArray jsonObjjj1 = (JSONArray) jsonObjj1.get("bindings");
			
			for(int x = 0; x < jsonObjjj1.size(); x++) {
				JSONObject y = (JSONObject)jsonObjjj1.get(x);
				JSONObject k = (JSONObject)y.get("label");
				String t = (String)k.get("value");
				JSONObject n = (JSONObject)y.get("abstract");
				String a = (String)n.get("value");
				t = t.replace("(", "");
				t = t.replace(")", "");
				t = t.replace("-", "");
				t = t.replace(".", "");
				t = t.replace("*", "");
				t = t.replace("/", "");
				t = t.replace(",", "");
				a = a.replace("(", "");
				a = a.replace(")", "");
				a = a.replace("-", "");
				a = a.replace(".", "");
				a = a.replace("*", "");
				a = a.replace("/", "");
				a = a.replace(",", "");
				
				if(x > 0) {
				if(t.equals(highSchoolNames_0_1000.get(x-1))) {
					t = "Duplcate" + x;
				}
				}
				
				if(x > 3) {
				if(t.equals(highSchoolNames_0_1000.get(x-2))) {
					t = "Duplicate" + x;
				}
				}
				
				if(x > 5) {
				if(t.equals(highSchoolNames_0_1000.get(x-3))) {
					t = "Duplicate" + x;
				}
				}
				
				if(x > 8) {
				if(t.equals(highSchoolNames_0_1000.get(x-4))) {
					t = "Duplciate" + x;
				}
				}
				
				
				
				highSchoolAbstracts.add(a);
				highSchoolNames_0_1000.add(t);
				
				
				
			}
			
			System.out.println(highSchoolNames_0_1000.size());
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		System.out.println(highSchoolAbstracts.size());
		
	}
	
	public static void hsToMySQL() {
		
		Connection conn = null;
		Statement stmt = null;
		int j = 0;
		
		try {
			
			
			//Register the JDBC Driver
			//Class.forName("com.mysql.jdbc.Driver");
			
			//Open the connection to MySQL
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//Execute a query
			System.out.println("Creating statement");
			stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO highschools (school, abstract)"
					+ " values(?, ?)";
			PreparedStatement prepStmt = conn.prepareStatement(sql);
			
			
			for(int x = 0; x < highSchoolAbstracts.size()-1; x++ ) {
				String abst = highSchoolAbstracts.get(x);
				String label = highSchoolNames_0_1000.get(x);
				
				if(x > 2) {
				if(label.equals(highSchoolNames_0_1000.get(x-1))) {
					label = "Duplicate" + x;
				}
				}
				prepStmt.setString(1, label);
				prepStmt.setString(2, abst);
				prepStmt.execute();
				j++;
				System.out.println("Entry #" + x + " complete");
			}
	
			
			
			conn.close();
			System.out.println("Database Population Successful");
			
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}
	
	

}
