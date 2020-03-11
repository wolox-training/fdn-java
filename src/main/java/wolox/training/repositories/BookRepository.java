package wolox.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wolox.training.models.Book;
/**
 * Repository Interface for {@link Book} class that extends {@link JpaRepository}
 *
 * @author federicodinucci
**/
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByAuthor(String author);

}
