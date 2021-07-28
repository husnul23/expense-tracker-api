package com.fadhilah.expensetrackerapi.repositories;

import com.fadhilah.expensetrackerapi.domain.Category;
import com.fadhilah.expensetrackerapi.exceptions.EtBadRequestException;
import com.fadhilah.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
