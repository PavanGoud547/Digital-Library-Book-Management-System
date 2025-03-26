package Pavan.in.Digital.Library.Book.Management.System;

import Pavan.in.Digital.Library.Book.Management.System.model.AvailabilityStatus;
import Pavan.in.Digital.Library.Book.Management.System.model.Book;
import Pavan.in.Digital.Library.Book.Management.System.repository.BookRepository;
import Pavan.in.Digital.Library.Book.Management.System.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    private Book mockBook;

    @BeforeEach
    void setup() {
        mockBook = new Book(1L, "Harry Potter", "J.K. Rowling", "Fantasy", AvailabilityStatus.AVAILABLE);
    }

    @Test
    void testGetBookById() {
        when(bookRepository.findById(1L)).thenReturn(Optional.of(mockBook));
        Book book = bookService.getBookById(1L);
        assertEquals("Harry Potter", book.getTitle());
    }

    private void assertEquals(String harryPotter, String title) {
        if (!harryPotter.equals(title)) {
            throw new AssertionError("Expected " + harryPotter + " but got " + title);
        }
    }
}
