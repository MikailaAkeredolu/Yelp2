package io.yelp;

import com.beust.jcommander.JCommander;
import io.yelp.util.YelpAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static io.yelp.util.YelpAPI.queryAPI;
import static org.scribe.model.OAuthConstants.*;

@SpringBootApplication
public class YelpApplication2Application {

	public static void main(String[] args) {

		final String CONSUMER_KEY = "DTIAMGukH_VE_Zqjveb23Q";
		final String CONSUMER_SECRET = "lgE5dlOTYdosCjDfb42zkzpZ_Lg";
		final String TOKEN = "xQvQWx1jw6h0t7joQcQTsqRHgUuT_25t";
		final String TOKEN_SECRET = "_3VVZ2aX7-hZazaROpLS_NazZEE";


		SpringApplication.run(YelpApplication2Application.class, args);

		YelpAPI.YelpAPICLI yelpApiCli = new YelpAPI.YelpAPICLI();
		new JCommander(yelpApiCli, args);

		YelpAPI yelpApi = new YelpAPI(CONSUMER_KEY, CONSUMER_SECRET, TOKEN, TOKEN_SECRET);
		queryAPI(yelpApi, yelpApiCli);
	}
}
