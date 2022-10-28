package com.backend.ApiPet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backend.ApiPet.model.Users;

public interface UsersRepository extends MongoRepository<Users, Long> {

}
