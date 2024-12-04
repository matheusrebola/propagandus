## Tornando o Script Executável

Dê permissão de execução ao script:

```bash
chmod +x update_repo.sh
```

## Agendando o Script com Cron

Use o **cron** para executar o script diariamente de madrugada (exemplo: 3:00 AM).

### Passos:
1. Abra o editor de tarefas agendadas:
   ```bash
   crontab -e
   ```

2. Adicione a seguinte linha ao arquivo de crontab:
   ```bash
   0 3 * * * /caminho/para/o/script/update_repo.sh >> /caminho/para/o/script/update_repo.log 2>&1
   ```

   - **`0 3 * * *`**: Executa às 3:00 AM todos os dias.
   - **`>> /caminho/para/o/script/update_repo.log`**: Salva o output em um log para monitoramento.

3. Salve e saia do editor.
```