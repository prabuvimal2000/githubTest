package com.librarymanagement.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookDetails,String>
{

}
