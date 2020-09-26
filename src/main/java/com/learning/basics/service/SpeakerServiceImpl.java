package com.learning.basics.service;

import java.util.List;

import com.learning.basics.model.Speaker;
import com.learning.basics.repositorry.SpeakerRepository;
import com.learning.basics.repositorry.SpeakerRepositoryImpl;

public class SpeakerServiceImpl implements SpeakerService {
	
	SpeakerRepository speakerRepository = new SpeakerRepositoryImpl();
	
	@Override
	public List<Speaker> getSpeakers(){
		
		return speakerRepository.getSpeakers();
		
	}

}
