package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main7 {


		
		private static final String BASE_URL= "http://api.currencylayer.com";
		private static final String API_KEY  = "b8279911836a5092b68c24ec548640f2";  //"2e4baadf5ae6ba436f53ae5558107f";
		private static final String SOURCE = "USD";
		private static final String CURRENCIES = "EUR";
		
		public static void main(String[] args) {
			
		
		try {
			Gson gson = new Gson();
			
	//		URL url = new URL(BASE_URL + "/live?аccess_key="+API_KEY+"&source="+SOURCE+"&currencies="+CURRENCIES);
			URL url = new URL ("http://api.currencylayer.com"+"/live?access_key="+"b8279911836a5092b68c24ec548640f2"+"&source="+"USD"+"&currencies="+"EUR");
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
		
			JsonObject rez = gson.fromJson(reader, JsonObject.class);
			System.out.println(rez);
			if (rez.get("success").getAsBoolean()) {
			
			double kurs = rez.get("quotes").getAsJsonObject().get("USDEUR").getAsDouble();
			
			
			System.out.println("Kurs je "+kurs);
			}
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
		
		}
		
		
	

}
