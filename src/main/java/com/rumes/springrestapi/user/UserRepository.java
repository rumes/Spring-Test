package com.rumes.springrestapi.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, String>  {

}
