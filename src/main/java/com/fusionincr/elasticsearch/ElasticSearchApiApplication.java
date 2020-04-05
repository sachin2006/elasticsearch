package com.fusionincr.elasticsearch;

import com.fusionincr.elasticsearch.models.Apartment;
import com.fusionincr.elasticsearch.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@SpringBootApplication
public class ElasticSearchApiApplication implements CommandLineRunner {

	@Autowired
	private ApartmentService apartmentService;

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//printElasticSearchInfo();
		elasticsearchTemplate.deleteIndex(Apartment.class);
		elasticsearchTemplate.createIndex(Apartment.class);

		apartmentService.saveApartment(new Apartment("SS0", "sarojsymphony0@gmail.com", "7760098987"));
		apartmentService.saveApartment(new Apartment("SS1", "sarojsymphony1@gmail.com", "7760098987"));
		apartmentService.saveApartment(new Apartment("SS2", "sarojsymphony2@gmail.com", "7760098987"));

		//fuzzey search
		//Page<Book> books = bookService.findByAuthor("Rambabu", new PageRequest(0, 10));

		//List<Book> books = bookService.findByTitle("Elasticsearch Basics");

		//books.forEach(x -> System.out.println(x));


	}

	//useful for debug, print elastic search details
//	private void printElasticSearchInfo() {
//
//		System.out.println("--ElasticSearch--");
//		Client client = es.getClient();
//		Map<String, String> asMap = client.settings().getAsMap();
//
//		asMap.forEach((k, v) -> {
//			System.out.println(k + " = " + v);
//		});
//		System.out.println("--ElasticSearch--");
//	}

}
