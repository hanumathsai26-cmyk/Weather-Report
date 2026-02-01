package com.jsp.lostandfoundthingswebservice.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.lostandfoundthingswebservice.DTO.LostandFound;
import com.jsp.lostandfoundthingswebservice.REPOSITORY.LostandFoundRepository;

@Service
public class LostandFoundService {
	
	@Autowired
    private LostandFoundRepository repository;

    public LostandFound insertLostandFound(LostandFound lostandFound) {
        return repository.save(lostandFound);
    }
}




