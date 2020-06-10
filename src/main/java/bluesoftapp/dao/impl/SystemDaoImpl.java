package bluesoftapp.dao.impl;


import bluesoftapp.dao.SystemDao;
import bluesoftapp.model.System;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository()
@Transactional
public class SystemDaoImpl implements SystemDao {

    private final SessionFactory sessionFactory;

    public SystemDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<System> getAllSystems() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<System> criteriaQuery = criteriaBuilder.createQuery(System.class);
        Root<System> root = criteriaQuery.from(System.class);
        criteriaQuery.select(root);
        Query query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
