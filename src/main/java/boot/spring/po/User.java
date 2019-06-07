package boot.spring.po;

import java.util.List;

public class User {
	private Integer id  ;
	private String username;
	private String password;
	private String tel;
	private Integer age;
	private List<UserRoleRelation> userRoleRelations;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<UserRoleRelation> getUserRoleRelations() {
		return userRoleRelations;
	}

	public void setUserRoleRelations(List<UserRoleRelation> userRoleRelations) {
		this.userRoleRelations = userRoleRelations;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", tel='" + tel + '\'' +
				", age=" + age +
				", userRoleRelations=" + userRoleRelations +
				'}';
	}
}
