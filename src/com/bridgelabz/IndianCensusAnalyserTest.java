package com.bridgelabz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndianCensusAnalyserTest {

	 @BeforeAll
	    public static void print_msg(){
	        System.out.println("----Welcome to Census Analyser----");
	    }
	    CensusAnalyser censusAnalyser;
	    @Test
	    void given_file_should_return_information() {
	        censusAnalyser = new CensusAnalyser();
	        censusAnalyser.readData();
	    }

}
