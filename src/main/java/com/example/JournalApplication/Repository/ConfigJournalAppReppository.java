package com.example.JournalApplication.Repository;

import com.example.JournalApplication.Entity.ConfigJournalAppEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppReppository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {
}
