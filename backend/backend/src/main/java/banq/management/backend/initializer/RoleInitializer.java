package banq.management.backend.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import banq.management.backend.entities.Role;
import banq.management.backend.service.IRoleService;


@Component
public class RoleInitializer implements CommandLineRunner{

	@Autowired
	private IRoleService roleService ;
	@Override
	public void run(String... args) throws Exception {
		
		if(!roleService.findByCode("ADMIN").isPresent())
		{
			Role role1 = new Role();
			role1.setCode("ADMIN");
			role1.setLabel("banq administrator");
			roleService.save(role1);
			
					}
		roleService.findAll().stream().
		forEach(role ->{System.out.println(role.toString());});
		
		System.out.println("salam");
	}

}
