package boot.spring.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.spring.mapper.LoginMapper;
import boot.spring.po.User;
import boot.spring.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{


	@Autowired
	LoginMapper loginmapper;
	public String getpwdbyname(String name) {
		User s=loginmapper.getUserByName(name);
		if(s!=null)
		return s.getPassword();
		else
		return null;
	}

}
