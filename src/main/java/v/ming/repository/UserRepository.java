package v.ming.repository;

import org.springframework.data.repository.CrudRepository;
import v.ming.entity.UserEntity;

/**
 * Created by Oliverlee on 2017/3/28.
 */
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
