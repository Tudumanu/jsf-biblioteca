package beans.dao;

import model.Periodico;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class PeriodicoDAO {
    private Session session;

    public PeriodicoDAO() {}

    public boolean insert(Periodico p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean delete(Periodico p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean update(Periodico p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public Periodico show(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Periodico periodico = (Periodico) session.get(Periodico.class, new Integer(id));
        session.close();

        return periodico;
    }

    public List<Periodico> search(String text) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Periodico> list = (List<Periodico>) session.createCriteria(Periodico.class)
                .add(
                        Restrictions.or(
                                Restrictions.ilike("titulo", "%" + text + "%"),
                                Restrictions.ilike("publicacao", "%" + text + "%")
                        )
                ).addOrder(Order.asc("id")).list();
        session.close();

        return list;
    }
}
