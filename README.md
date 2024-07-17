# Shop

Spring boot | JAVA | SQL | H2 | Spring Security | AUTH0 | JWT

Choose environment:

* application yml: spring.profiles.active=dev
* program arguments: --spring.profiles.active=dev
* VM options: -Dspring.profiles.active=dev

Database connection:

* H2: http://localhost:8080/h2-console

Documentation:

* Swagger: http://localhost:8080/swagger-ui.html

Security:

* Basic Auth:
    - user
    - password
* Headers:
    - X-CSRF-TOKEN: DMC3RFcvYsuxaK3CcAjiADDr0HNUcjN
* RSA:
    - DOC: https://auth0.com/docs/secure/application-credentials/generate-rsa-key-pair

Git commands:

* Criar branch local:
    - git checkout -b *< nome da branch local >*

* Criar branch remota e vincular com a local:
    - git push --set-upstream origin *< nome da branch local >*

Atualizar branch local com a branch main:

- git stash (Se houver alterações não comitadas)
- git pull --rebase origin main
- git stash pop (Se realizado o stash)

Convencional commits:

* doc: https://www.conventionalcommits.org/pt-br/v1.0.0/