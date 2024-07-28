/* BTime - 2024 */
package com.vn.project.btime.service.impl;

import com.vn.project.btime.service.BaseService;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    @Override
    public <S extends T> S saveAndFlush(S entity) {
        return getRepository().saveAndFlush(entity);
    }

    @Override
    public <S extends T> List<S> saveAllAndFlush(Iterable<S> entities) {
        return getRepository().saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<T> entities) {
        getRepository().deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<ID> ids) {
        getRepository().deleteAllByIdInBatch(ids);
    }

    @Override
    public void deleteAllInBatch() {
        getRepository().deleteAllInBatch();
    }

    @Override
    public T getReferenceById(ID id) {
        return getRepository().getReferenceById(id);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example) {
        return getRepository().findAll(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return getRepository().findAll(example, sort);
    }

    abstract JpaRepository<T, ID> getRepository();
}
