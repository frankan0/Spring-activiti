package boot.spring.mapper;

import java.util.List;

import boot.spring.po.Permission;


public interface PermissionMapper {
	List<Permission> getPermissions();
	Permission getPermissionByName(String name);
	void addpermission(String name);
	void deletepermission(int pid);
	void deleteRolePermission(int permissionid);
}
