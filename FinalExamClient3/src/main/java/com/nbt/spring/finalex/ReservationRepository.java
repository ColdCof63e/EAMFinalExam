package com.nbt.spring.finalex;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.client.MongoDatabase;

public interface ReservationRepository extends MongoRepository<Reservation, String> {

}
