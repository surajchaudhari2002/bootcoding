package com.example.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        try {
			// Step 1: Read the JSON file
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNode = mapper.readTree(new File("C:\\Users\\ASUS\\suraj\\LeetScrape\\LeetScrape-main\\example\\data\\all.json"));
			// Step 3: Connect to the database
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";

			try {
				Connection conn = DriverManager.getConnection(url, "postgres", "Suraj@2002");
				String sql = "INSERT INTO examples (body,parse_body) VALUES (?,?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				// Step 2: Parse JSON array and extract "body" values
				for (JsonNode node : rootNode) {
					String body = node.get("Body").toString();
//					System.out.println(body);// Extracting the "Body" value
					Document doc = Jsoup.parse(body);
					String textContent = doc.text();
					// Step 2: Remove HTML tags from the text content
					pstmt.setString(1, body);
					pstmt.setString(2, textContent);
					pstmt.executeUpdate();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
        }
    }


