package be.ifosup.poo.dao.dao;

public interface DAO<T> {
    T save(T object);      //CREATE

    T find(long id);       //READ

    T update(T object);    //UPDATE

    void delete(T object); //DELETE

    //List<T> findAll();

    //void saveAll(Collection<T> collection);
}
