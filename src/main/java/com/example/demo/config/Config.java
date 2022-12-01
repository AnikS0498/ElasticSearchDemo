package com.example.demo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.RestClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SuppressWarnings("deprecation")
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.demo.Repository")
public class Config extends AbstractElasticsearchConfiguration {

	@Value("${spring.elasticsearch.rest.uris}")
	public String elasticsearchUrl;
	
	@Bean
	@Override
	public RestHighLevelClient elasticsearchClient() {
		// TODO Auto-generated method stub
		final ClientConfiguration config=ClientConfiguration.builder().connectedTo(elasticsearchUrl).build();
		return RestClients.create(config).rest();
	}
 
    
 
   
}