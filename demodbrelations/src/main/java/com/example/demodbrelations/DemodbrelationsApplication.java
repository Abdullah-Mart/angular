package com.example.demodbrelations;

import com.example.demodbrelations.entities.Address;
import com.example.demodbrelations.entities.Course;
import com.example.demodbrelations.entities.Grade;
import com.example.demodbrelations.entities.Student;
import com.example.demodbrelations.repositories.AddressRepository;
import com.example.demodbrelations.repositories.CourseRepository;
import com.example.demodbrelations.repositories.GradeRepository;
import com.example.demodbrelations.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.*;

@SpringBootApplication
public class DemodbrelationsApplication {

	@Bean
	public CommandLineRunner run(CourseRepository courseRepository, StudentRepository studentRepository,
								 AddressRepository addressRepository,
								 GradeRepository gradeRepository) {
		return (args -> {
			Address address= new Address();
			address.setStreet("Bechlaan");
			addressRepository.save(address);

			Student student1= new Student();
			student1.setName("jazmeene");
			student1.setAddress(address);
			studentRepository.save(student1);
			address.setStudent(student1);
			addressRepository.save(address);

			//TODO: Create objects from your classes here.
			// Make sure you pass all the necessary objects
			// Store them in the database using the repositories
			// Print them on the commandline.
		});
	}


	public static void main(String[] args) {
		SpringApplication.run(DemodbrelationsApplication.class, args);
	}

}
