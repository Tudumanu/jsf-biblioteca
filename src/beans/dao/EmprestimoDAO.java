package beans.dao;

import model.Emprestimo;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class EmprestimoDAO {
    private Session session;

    public EmprestimoDAO() {}

    public boolean insert(Emprestimo p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean delete(Emprestimo p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean update(Emprestimo p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public Emprestimo show(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Emprestimo emprestimo = (Emprestimo) session.get(Emprestimo.class, new Integer(id));
        session.close();

        return emprestimo;
    }

    public List<Emprestimo> search(String tipo, int numeroPessoa, int numeroItem) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Emprestimo> list = (List<Emprestimo>) session.createCriteria(Emprestimo.class)
                .add(
                        Restrictions.or(
                                Restrictions.eq("numeroPessoa", numeroPessoa),
                                Restrictions.eq("numeroItem", numeroItem),
                                Restrictions.ilike("tipo", tipo)
                        )
                ).addOrder(Order.asc("id")).list();
        session.close();

        return list;
    }
}
