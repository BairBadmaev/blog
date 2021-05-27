package com.bair.blog.repo;

import com.bair.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>/*добавить удалить и обновить и тд из таблицы */ {

}
