package beans.dao;

import model.Pessoa;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class PessoaDAO {

    private Session session;

    public PessoaDAO() {}

    public boolean insert(Pessoa p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean delete(Pessoa p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean update(Pessoa p) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(p);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public Pessoa show(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Pessoa pessoa = (Pessoa) session.get(Pessoa.class, new Integer(id));
        session.close();

        return pessoa;
    }

    public List<Pessoa> buscar(String text) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Pessoa> list = (List<Pessoa>) session.createCriteria(Pessoa.class)
                            .add(Restrictions.like("nome", "%"+ text +"%")).list();
        session.close();

        return list;
    }


}
