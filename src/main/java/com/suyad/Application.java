package com.suyad;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.suyad.Repo.BookRepo;
import com.suyad.entity.Book;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext cxt = SpringApplication.run(Application.class, args);
		System.out.println("Spring Application Started");
		BookRepo repo = (BookRepo)cxt.getBean(BookRepo.class);
		System.out.println(repo.getClass().getName());
		
		Book b = new Book();
		b.setBoodId(1);
		b.setBookName("core Java");
		b.setBookprice(450L);
		
		Book b1 = new Book();
		b1.setBoodId(2);
		b1.setBookName("Adv Java");
		b1.setBookprice(550L);
		
		Book b2 = new Book();
		b2.setBoodId(3);
		b2.setBookName("Spring framework");
		b2.setBookprice(500L);
		
		Book b3 = new Book();
		b3.setBoodId(4);
		b3.setBookName("Spring Boot App");
		b3.setBookprice(500L);
		
		Book b4 = new Book();
		b4.setBoodId(5);
		b4.setBookName("HTML & CSS");
		b4.setBookprice(350L);
		
		Book b5 = new Book();
		b5.setBoodId(6);
		b5.setBookName("Java Script");
		b5.setBookprice(600L);
		
		Book b6 = new Book();
		b6.setBoodId(7);
		b6.setBookName("React JS");
		b6.setBookprice(950L);
		
		
		repo.saveAll(Arrays.asList(b,b1,b2,b3,b4,b5,b6));
		System.out.println("All Entities has been Savend Successfully");
		//Optional<Book> findById = repo.findById(1);
		//System.out.println(findById.get());
		
		/*
		List<Book> books = repo.findBybookpriceLessThan(525d);
		books.stream().forEach(System.out::println);
		
		Book mymethod = repo.mymethod(550d);
		System.out.println(mymethod);
		
		
		PageRequest p = PageRequest.of(3-1, 3);
		Sort ascending = Sort.by("bookprice","bookName").descending();
		Page<Book> findAll = repo.findAll(p);
		List<Book> content = findAll.getContent();
		content.stream().forEach(System.out::println);
		*/
		
		
	}

}
