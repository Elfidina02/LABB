package DB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class CreateTable {

	
	public static void createtablecoordimoni(Connection connection) throws SQLException  {
		Statement statement = connection.createStatement(); 
		String createTableSQL3 = "CREATE TABLE CoordinateMonitoraggio ("
		        + "id INT,"
		        + "name VARCHAR(255),"
		        + "asciiname VARCHAR(255),"
		        + "countrycode VARCHAR(2),"
		        + "countryname VARCHAR(255),"
		        + "coordinate VARCHAR(255))"; 
		statement.execute(createTableSQL3); 
		String createTableSQL = "CREATE TABLE OperatoriRegistrati ("
				+"idoperatore SERIAL PRIMARY KEY,"
		        + "nome VARCHAR(255),"
		        + "cognome VARCHAR(255),"
		        + "codicefiscale VARCHAR(255),"
		        + "postaelet VARCHAR(255),"
		        + "userid VARCHAR(255),"
		        + "password VARCHAR(255),"
		        + "idCentroMonitoraggio VARCHAR(255))"; 
		statement.execute(createTableSQL); 
		
		String createTableSQL1 = "CREATE TABLE CentriMonitoraggio ("
				+ "id  SERIAL PRIMARY KEY,"
		        + "nomecentro VARCHAR(255) ,"
		        + "via VARCHAR(255),"
		        + "numerocivico  VARCHAR(255),"
		        + "cap  VARCHAR(255),"
		        + "comune VARCHAR(255),"
		        + "provincia VARCHAR(2))";
		       
		statement.execute(createTableSQL1); 
		
		
		String createTableSQL2 = "CREATE TABLE AreeInteresse ("
		        + "id SERIAL PRIMARY KEY,"
				+"centroid  VARCHAR(255),"
		        + "area VARCHAR(255))";
				
		statement.execute(createTableSQL2); 
		String createTableSQL4 = "CREATE TABLE ParametriClimatici("
				+" id SERIAL PRIMARY KEY,"
				+ "nomeCentro VARCHAR(255),"            
				+ "areainteressata VARCHAR(255),"
				+ "Vento VARCHAR(5),"
				+ "Umidità VARCHAR(5),"
				+ "Pressione VARCHAR(5),"
				+ "Temperatura VARCHAR(5),"
				+ "Precipitazioni VARCHAR(5),"
				+ "AltdeiGhiacciai VARCHAR(5),"
				+ "MassadeiGhiacciai VARCHAR(5),"
				+ "Nuvolosità VARCHAR(5),"
				+ "Notes VARCHAR(256))";
		statement.execute(createTableSQL4);





				
				
	}
	
	

	
	public static void inserisci (String url,String username, String password){
	    try (Connection connection = DBManager.connect( url,username,  password); 
	                BufferedReader reader = new BufferedReader(new InputStreamReader(CreateTable.class.getClassLoader().getResourceAsStream("data/CoordinateMonitoraggio.csv")))) {
	            String line;
	            String sql = "INSERT INTO CoordinateMonitoraggio (id, name, asciiname,countrycode,countryname,coordinate) VALUES (?, ?, ?, ?, ?, ?)";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) { 
	                while ((line = reader.readLine()) != null) {
	                    String[] data = line.split(";");
	                     int id = Integer.parseInt(data[0]); 
	                    String name = data[1]; 
	                   String asciiname= data[2]; 
	                   String countrycode=data[3];
	                   String countryname=data[4];
	                   String coordinate=data[5];
	                   
	                    preparedStatement.setInt(1, id); 
	                    preparedStatement.setString(2, name); 
	                    preparedStatement.setString(3, asciiname);
	                    preparedStatement.setString(4,countrycode ); 
	                    preparedStatement.setString(5, countryname); 
	                    preparedStatement.setString(6, coordinate);
	                    preparedStatement.executeUpdate(); } 
	                System.out.println("Data inserted successfully!"); }
	        } catch (SQLException | NumberFormatException e) { 
	            e.printStackTrace(); } 
	        catch (Exception e) { 
	            e.printStackTrace(); } }
	
}