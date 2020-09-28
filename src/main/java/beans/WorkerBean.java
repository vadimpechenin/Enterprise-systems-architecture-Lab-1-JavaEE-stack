package beans;

import entity.Worker;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Singleton
public class WorkerBean {
    @PersistenceContext(unitName = "esa")
    private EntityManager em;

    public Collection<Worker> findAll(){
        return em.createQuery("SELECT c FROM Worker c", Worker.class).getResultList();
    }
}
