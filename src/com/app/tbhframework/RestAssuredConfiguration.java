package com.app.tbhframework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class RestAssuredConfiguration extends Driver{
	static Properties properties = null;
	
	/***
	 * @param env
	 * This method load all properties values in system location w.r.t ENVIRONMENT
	 * 
	 * **/
	public void loadProperties(String env) {
		String file_name = null;
		String env_name = System.getProperty("ENVIRONMENT", env);
		System.out.println("Environment is >> "+env_name);
		properties = new Properties();
		FileInputStream inputStream;

		try {
			if(env_name.equalsIgnoreCase("PROD"))
				file_name = "config/config_prod.properties";
			else if(env_name.equalsIgnoreCase("PREPROD"))
				file_name = "config/config_preprod.properties";
			else if(env_name.equalsIgnoreCase("TEST")) 
				file_name = "config/config_test.properties";

			inputStream = new FileInputStream(file_name);
			properties.load(inputStream);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	/***
	 * @param key_start_name
	 * Method will set uri , port & end point from taking values properties file
	 * 
	 * **/
	public void configure(String key_start_name) {
		RestAssured.reset();
		Set<String> keys = properties.stringPropertyNames();
		for(String key : keys) {
			if(key.startsWith(key_start_name) && key.endsWith("IP"))
				RestAssured.baseURI = properties.getProperty(key);
			else if(key.startsWith(key_start_name) && key.endsWith("PORT"))
				RestAssured.port = Integer.parseInt(properties.getProperty(key));
			else if(key.startsWith(key_start_name) && key.endsWith("BASE_PATH"))
				RestAssured.basePath = properties.getProperty(key);
		}
	}

	/**
	 * @param headers
	 * Get or Set headers for Dev API
	 * 
	 * 
	 * */
	public RequestSpecification getRequestSpecification(Map<String, String> headers) {
		if(headers!=null){
			return RestAssured.given().log().all().headers(headers).contentType(ContentType.JSON);
		}else{
			Map<String, String> head = new HashMap<String, String>();
			head.put("Content-Type", "application/json");
			head.put("adsHeader", "adsHeader");
			head.put("googleCookie", "google.com");
			return RestAssured.given().log().all().headers(head).contentType(ContentType.JSON);
		}
	}

	public Response getResponse(RequestSpecification requestSpecification, String endpoint){
		Response response = requestSpecification.get(endpoint).then().extract().response();
		//response.then().log().all();
		return response;
	}

	public Response postRequest(RequestSpecification requestSpecification,String text,String endpoint){
		Response response = requestSpecification.body(text).post(endpoint);
//		Assert.assertEquals(response.getStatusCode(), status, "Response Code doesn't match");
		response.then().log().all();
		return response;
	}

	public File getTestDataClassPath(String file_name) {
		String pack = this.getClass().getPackage().getName();
		pack = pack.split("com.airtel.RestAssured.")[1];

		pack = pack.replaceAll("\\.", Matcher.quoteReplacement(File.separator));

		String pathname = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "test_data"
				+ File.separator + pack;

		File file = new File(System.getProperty("user.dir")+File.separator+pathname+File.separator+file_name);

		return file;
	}

	protected String readFile(String file) {
		StringBuilder stringBuilder = new StringBuilder();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			String ls = System.getProperty("line.separator");

			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
		} catch (IOException e) {
			Assert.fail("Could not find file " + file);
		}
		
		return stringBuilder.toString();
	}

	public String getDate(String format){
		SimpleDateFormat sDate = new SimpleDateFormat(format);
		Date now = new Date();
		String todaydate = sDate.format(now);
		return todaydate;
	}

	public String round(Object obj, int places) {
		BigDecimal value = new BigDecimal(obj.toString()).setScale(places, RoundingMode.HALF_UP);
		return value.toString();
	}

    public static boolean booleanValue(String propName, boolean defaultValue){
        String prop = System.getProperty(propName);
        boolean val;

        if (prop == null)
            val = defaultValue;
        else
            val = Boolean.valueOf(prop.trim());
        return val;
    }

}