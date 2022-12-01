package com.example.demo.Repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.Entity.Dataset;


@Repository
public interface DatasetRepository extends ElasticsearchRepository<Dataset, Integer> {

}
