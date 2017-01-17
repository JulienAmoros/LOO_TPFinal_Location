import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JuAmo_000 on 17/01/2017.
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        //initializeDB(em);

        em.getTransaction().commit();
        em.close();
    }

    public static void initializeDB(EntityManager em){
        //Initialisation d'entités de base//

    }
}
