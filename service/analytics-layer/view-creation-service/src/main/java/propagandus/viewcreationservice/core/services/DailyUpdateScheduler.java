package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class DailyUpdateScheduler {
    private List<ViewCreationService> viewCreationServices;

    @Scheduled(cron = "0 0 4 * * ?")
    public void updateViews() {
        viewCreationServices.forEach(ViewCreationService::process);
    }
    
    @Scheduled(cron = "0 0 1 * * ?")
    public void deleteViews() {
        viewCreationServices.forEach(ViewCreationService::clearDatabase);
    }
}
