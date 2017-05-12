package com.blogspot.exodusdelaghetto.jasper.report.form.repository;

import com.blogspot.exodusdelaghetto.jasper.report.form.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by exodus on 5/12/17.
 */
public interface PersonRepository extends JpaRepository<Person,Long>{
}
