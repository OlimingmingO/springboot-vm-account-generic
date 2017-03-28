package v.ming.service;

import bean.User;
import interf.UserService;
import org.springframework.stereotype.Service;
import v.ming.entity.UserEntity;
import v.ming.repository.UserRepository;

import javax.annotation.Resource;

/**
 * Created by Oliverlee on 2017/3/28.
 */
@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserRepository userRepository;
    public void deleteById(String var1){
        userRepository.delete(Integer.parseInt(var1));
    }

    public void update(User var1){
        System.out.println("@@@@@@Provider UserServiceImpl update() is called");
        UserEntity userEntity = new UserEntity();
        userEntity.setId(var1.getId());
        userEntity.setName(var1.getName());
        userEntity.setBirthday(var1.getBirthday());
        userEntity.setMobile(var1.getMobile());
        userEntity.setPassword(var1.getPassword());
        userEntity.setRemark(var1.getRemark());
        userEntity.setSex(var1.getSex());

        userRepository.save(userEntity);
    }
}
