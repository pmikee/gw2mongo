package net.javabeat.springdata.repo;

import java.math.BigInteger;

import net.javabeat.springdata.jpa.data.Item;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Item, BigInteger>{

}
