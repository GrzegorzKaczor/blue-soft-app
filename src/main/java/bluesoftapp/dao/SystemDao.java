package bluesoftapp.dao;


import bluesoftapp.model.Contract;
import bluesoftapp.model.System;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Repository
public interface SystemDao {

    List<System> getAllSystems();
}
