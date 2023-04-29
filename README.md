# Controle
# Unsecured hospital app
Application de gestion des Patients
## Author

- [AYA ZOUITY ](https://github.com/Ayaytiuoz/Controle.git)
## Plan
- La logique du JPA
- Le contexte generale de l'application
- System d'authentification
- Liste des Patients
- Ajouter Patient
## La logique du JPA
JPA (Java Persistence API) est une API de persistance de données qui permet aux développeurs Java de mapper des objets Java sur des tables de bases de données relationnelles. La logique du JPA repose sur les principes de la programmation orientée objet et de la gestion des données relationnelles.

La première étape de la logique du JPA est la création de classes d'entités Java qui représentent les tables de la base de données. Les classes d'entités sont annotées avec des annotations JPA, qui définissent la correspondance entre les champs de la classe et les colonnes de la table.

Ensuite, un gestionnaire d'entités JPA (EntityManager) est utilisé pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur les entités Java. Les opérations CRUD sont traduites en instructions SQL correspondantes pour interagir avec la base de données.

JPA prend également en charge la gestion de la persistance de l'état des entités Java, c'est-à-dire la capacité à détecter les changements apportés à une entité et à les synchroniser automatiquement avec la base de données.

Enfin, JPA permet de gérer les relations entre les entités Java, telles que les relations de type "many-to-one", "one-to-many" et "many-to-many". Les relations sont également annotées et gérées automatiquement par le gestionnaire d'entités JPA.

En résumé, la logique du JPA repose sur la création de classes d'entités Java annotées, la gestion des opérations CRUD par le gestionnaire d'entités JPA, la synchronisation automatique de l'état des entités avec la base de données et la gestion des relations entre les entités.
## Le contexte generale de l'application
L'idée de cette application est de créer un système de gestion de patients utilisant Spring Boot et JPA pour la persistance des données. L'application permet aux administrateurs de gérer les informations des patients, tandis que les utilisateurs simples peuvent seulement visualiser la liste des patients. Les fonctionnalités principales de l'application incluent l'ajout, la suppression, et la modification des patients, ainsi que l'affichage des patients dans un tableau.
