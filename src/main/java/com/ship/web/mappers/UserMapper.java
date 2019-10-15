package com.ship.web.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ship.web.domains.UserDTO;

@Repository
public interface UserMapper {
	public boolean insertEmp(UserDTO param);
	public int countUser();
	public UserDTO selectByEmpnoEname(UserDTO param);
	public List<UserDTO> findByTable(UserDTO param);
}
