package sages.bootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.Instant;
import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("postgres");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    Notebook samsungNotebook = new Notebook(0, "Samsung", 1300, Instant.now());
    entityManager.persist(samsungNotebook);
    System.out.println(samsungNotebook);

    Notebook acerNotebook = new Notebook(0, "Acer", 1500, Instant.now());
    entityManager.persist(acerNotebook);
    System.out.println(acerNotebook);

    Town town = new Town(0, "Warszawa", 100);
    entityManager.persist(town);
    System.out.println(town);

    User user = new User(0, "marcin.krol", 25, Arrays.asList(samsungNotebook, acerNotebook), town);
    entityManager.persist(user);
    System.out.println(user);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
