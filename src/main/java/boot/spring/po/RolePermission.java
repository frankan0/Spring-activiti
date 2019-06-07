package boot.spring.po;

public class RolePermission {
	int id;
	Role role;
	Permission permission;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return "RolePermission{" +
				"id=" + id +
				", role=" + role +
				", permission=" + permission +
				'}';
	}
}
