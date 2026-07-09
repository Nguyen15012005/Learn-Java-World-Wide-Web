package iuh.fit.midterm01.repository;

/**
 * @author Nguyễn Nam Trung Nguyên
 * @version 1.0
 * @MSSV 23640731
 * @Class DHKTPM19ATT
 * @since 7/9/2026
 */
public interface GenericRepository<T> {
    void save(T entity);

    void delete(Long id);

    T findById(Long id);
}
