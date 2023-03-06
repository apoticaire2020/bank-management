package banq.management.backend.service;

import java.util.List;
import java.util.Optional;

import banq.management.backend.entities.Role;

public interface IRoleService {

	Role save (Role role);
	Optional<Role> findById(Long id);
	List<Role> findAll();
	Optional<Role> findByCode(String code);
}
