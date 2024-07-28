/* BTime - 2024 */
package com.vn.project.btime.service;

import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

public interface BaseService<T, ID> {

    <S extends T> S saveAndFlush(S entity);

    <S extends T> List<S> saveAllAndFlush(Iterable<S> entities);

    void deleteAllInBatch(Iterable<T> entities);

    void deleteAllByIdInBatch(Iterable<ID> ids);

    void deleteAllInBatch();

    T getReferenceById(ID id);

    <S extends T> List<S> findAll(Example<S> example);

    <S extends T> List<S> findAll(Example<S> example, Sort sort);
}
