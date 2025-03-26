package Pavan.in.Digital.Library.Book.Management.System.repository;

import Pavan.in.Digital.Library.Book.Management.System.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
}