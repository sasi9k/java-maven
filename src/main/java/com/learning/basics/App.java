package com.learning.basics;

import com.learning.basics.service.SpeakerService;
import com.learning.basics.service.SpeakerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	SpeakerService speakerService = new SpeakerServiceImpl();
    	
    	
        System.out.println( "Hello World! "+ speakerService.getSpeakers().get(0).getFirstName() );
    }
}
