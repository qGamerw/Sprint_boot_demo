package com.example.demo.accessingdatamysql;

import com.example.demo.domain.MassengDao;
import org.springframework.data.repository.CrudRepository;

public interface MassengDaoAccessingdatamysql extends CrudRepository<MassengDao, Long> {
}
