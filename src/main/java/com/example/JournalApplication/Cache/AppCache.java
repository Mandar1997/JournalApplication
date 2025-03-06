package com.example.JournalApplication.Cache;

import com.example.JournalApplication.Entity.ConfigJournalAppEntity;
import com.example.JournalApplication.Repository.ConfigJournalAppReppository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {
    public enum keys{
        WEATHER_API;
    }

    public Map<String, String> appCache;

    @Autowired
    private ConfigJournalAppReppository configJournalAppReppository;

    @PostConstruct
    public void init(){
        appCache = new HashMap<>();
        List<ConfigJournalAppEntity> all = configJournalAppReppository.findAll();
        for(ConfigJournalAppEntity configJournalAppEntity : all ){
            appCache.put(configJournalAppEntity.getKey(), configJournalAppEntity.getValue());
        }
    }
}
