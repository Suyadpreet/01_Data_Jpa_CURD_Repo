package com.suyad.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.suyad.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> 
{
	public List<Book> findBybookpriceGreaterThan(Double bookprice);
	public List<Book> findBybookpriceLessThan(Double bookprice);
	
	@Query("From Book where bookprice = :price ")
	public Book mymethod(Double price);
	
	@Query(value = "update Book set bookprice = :price  where book_Id = :id)", nativeQuery = true)
	public void updatemethod(@Param("id")Integer id,@Param("price")Long price);
	
	
}
