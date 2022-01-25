//Create repository to perform operations in database
package com.quizapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,String>
{

	User findUserByEmailAddress(String userName);

}
