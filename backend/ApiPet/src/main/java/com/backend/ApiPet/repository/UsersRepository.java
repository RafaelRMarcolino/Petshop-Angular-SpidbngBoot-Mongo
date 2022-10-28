package com.backend.ApiPet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.backend.ApiPet.model.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, Long> {

}
