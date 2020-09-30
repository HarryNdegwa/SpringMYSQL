package com.example.springmysql;

import org.springframework.data.jpa.repository.JpaRepository;

// the jpa repository for CRUD operations
interface BookRepository extends JpaRepository<Book, Long> {

}
