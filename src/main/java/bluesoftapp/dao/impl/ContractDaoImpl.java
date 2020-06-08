package bluesoftapp.dao.impl;

import bluesoftapp.dao.ContractDao;
import bluesoftapp.model.Contract;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Repository()
@Transactional
public class ContractDaoImpl implements ContractDao {


    private final SessionFactory sessionFactory;

    public ContractDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Contract> getAllContracts() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Contract> criteriaQuery = criteriaBuilder.createQuery(Contract.class);
        Root<Contract> root = criteriaQuery.from(Contract.class);
        criteriaQuery.select(root);
        Query query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public void addContract(Contract contract) {
        Session session = sessionFactory.getCurrentSession();
        session.save(contract);
    }

    @Override
    public void deleteContract(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Contract contract = session.byId(Contract.class).load(id);
        session.delete(contract);
    }
}
