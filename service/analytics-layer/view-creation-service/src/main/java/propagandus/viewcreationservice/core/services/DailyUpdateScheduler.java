package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DailyUpdateScheduler {
    private final List<ViewCreationService> viewCreationServices;

    //Método que será executado diariamente às 4h da manhã.
    @Scheduled(cron = "0 0 4 * * ?")
    public void updateViews() {
        viewCreationServices.forEach(ViewCreationService::process);
    }
}
