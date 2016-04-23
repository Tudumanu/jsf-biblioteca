package beans.dao;

import model.Livro;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class LivroDAO {
    
    private Session session;
    
    public LivroDAO() {}

    public boolean insert(Livro p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean delete(Livro p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean update(Livro p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public Livro show(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Livro Livro = (Livro) session.get(Livro.class, new Integer(id));
        session.close();

        return Livro;
    }

    public List<Livro> search(String text) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Livro> list = (List<Livro>) session.createCriteria(Livro.class)
                                .add(
                                    Restrictions.or(
                                        Restrictions.ilike("titulo", "%" + text + "%"),
                                        Restrictions.ilike("autorPrincipal", "%" + text + "%")
                                    )
                                ).addOrder(Order.asc("id")).list();
        session.close();

        return list;
    }
}
