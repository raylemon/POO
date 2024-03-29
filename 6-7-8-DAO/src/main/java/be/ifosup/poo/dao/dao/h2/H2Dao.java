package be.ifosup.poo.dao.dao.h2;

import be.ifosup.poo.dao.dao.DAO;

import java.sql.Connection;

public abstract class H2Dao<T> implements DAO<T> {
    Connection connection = ConnectionSingleton.getConnection();
    public final String LOG_CAT = this.getClass().getSimpleName();
}
