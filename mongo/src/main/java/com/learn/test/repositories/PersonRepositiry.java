package com.learn.test.repositories;

import com.learn.test.entity.Person;
import org.bson.types.ObjectId;
import repositories.TribalcRepository;

/**
 * Created by ShuangWang on 2017/10/23.
 */
public interface PersonRepositiry extends TribalcRepository<Person, ObjectId> {

}
