package boot.spring.po;

import java.util.List;

public class Role {
	private int id;
	private String name;
	private List<UserRoleRelation> useRoleRelations;
	private List<RolePermission> rolePermissions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserRoleRelation> getUseRoleRelations() {
		return useRoleRelations;
	}

	public void setUseRoleRelations(List<UserRoleRelation> useRoleRelations) {
		this.useRoleRelations = useRoleRelations;
	}

	public List<RolePermission> getRolePermissions() {
		return rolePermissions;
	}

	public void setRolePermissions(List<RolePermission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", name='" + name + '\'' +
				", useRoleRelations=" + useRoleRelations +
				", rolePermissions=" + rolePermissions +
				'}';
	}
}
