package propagandus.viewcreationservice.core.services;

import org.springframework.stereotype.Service;

@Service
public interface ViewCreationService {
	void process();
	void clearDatabase();
}
