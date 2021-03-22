package app;


import org.example.models.Person;

import javax.persistence.*;


public class App {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("org.example");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Person person = new Person("Raskar", "Kapak", "raskar.kapak@live.co.jp");

        entityManager.persist(person);
        transaction.commit();

        entityManager.close();
    }
}
