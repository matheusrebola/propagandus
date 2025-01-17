package propagandus.viewcreationservice.core.services;

public abstract class AViewCreationService implements ViewCreationService {

	@Override
    public void process() {
        try {
            executeProcess();
        } catch (Exception e) {
            System.out.print("Erro no serviço {}: {}" + this.getClass().getSimpleName() + e.getMessage() + e);
        }
    }

    protected abstract void executeProcess();
}
