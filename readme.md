## Aplicação Spring API de remédios para farmacos

Ordem de commits

1. Preparação do ambiente

2. Criação de DTO

3. Adição de dependências

   - Validation -> reponsável pela validação dos campos das requisições
   - mySQL Driver -> integração com banco de dados mysql
   - Flyway Migration -> faz as migrations das databases
   - Spring Data JPA -> criação de entidades e integração com banco

4. Criando entidade para banco de dados
5. Usando Flyway para controle de migrações V1\_\_create-table-remedio
6. Alteração no tipo de dados de quantidade para int na migration
7. Adicionando o método put (CRUD)
8. Adicionando o verbo delete (CRUD)
9. Adicionando exclusão lógica, desativando um registro do estoque. Criando nova migration.
10. Criando response entity
11. Lidando com erros
12. Lidadando com erros 
13. Adicionado retorno para os erros
14. Adicionando dependencias do Spring security

