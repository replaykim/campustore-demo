package com.somethinglikethat.campustore.service;


import com.somethinglikethat.campustore.model.App;
import com.somethinglikethat.campustore.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AppService {
    @Autowired
    private AppRepository appRepository;

    public List<App> list(){
        return appRepository.findAll();
    }

    public App getApp(Long appNo) {
        return appRepository.findOne(appNo);
    }

    public App addApp(App app) {
        App app1 = appRepository.save(app);
        return app1;
    }
}
