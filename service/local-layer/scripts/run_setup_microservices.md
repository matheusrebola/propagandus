Tornar o script executável
Execute o comando abaixo para dar permissão de execução ao script shell:

bash
Copiar código
chmod +x run_setup_microservices.sh
Passo 3: Configurar a execução na inicialização
Existem algumas maneiras de garantir que o script seja executado ao inicializar a máquina. Aqui estão duas opções comuns:

1. Usando o crontab com @reboot
Edite o crontab para o usuário atual:

bash
Copiar código
crontab -e
Adicione a seguinte linha ao arquivo do crontab:

bash
Copiar código
@reboot /caminho/para/run_setup_microservices.sh
Isso garante que o script seja executado automaticamente a cada reinicialização.