# Controle
# Unsecured hospital app
Application de gestion des Patients
## Author

- [AYA ZOUITY ](https://github.com/Ayaytiuoz/Controle.git)
## Plan
- La logique du JPA
- Le contexte generale de l'application
- Les annotation
- Screenshots
## La logique du JPA
JPA (Java Persistence API) est une API de persistance de données qui permet aux développeurs Java de mapper des objets Java sur des tables de bases de données relationnelles. La logique du JPA repose sur les principes de la programmation orientée objet et de la gestion des données relationnelles.

La première étape de la logique du JPA est la création de classes d'entités Java qui représentent les tables de la base de données. Les classes d'entités sont annotées avec des annotations JPA, qui définissent la correspondance entre les champs de la classe et les colonnes de la table.

Ensuite, un gestionnaire d'entités JPA (EntityManager) est utilisé pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur les entités Java. Les opérations CRUD sont traduites en instructions SQL correspondantes pour interagir avec la base de données.

JPA prend également en charge la gestion de la persistance de l'état des entités Java, c'est-à-dire la capacité à détecter les changements apportés à une entité et à les synchroniser automatiquement avec la base de données.

Enfin, JPA permet de gérer les relations entre les entités Java, telles que les relations de type "many-to-one", "one-to-many" et "many-to-many". Les relations sont également annotées et gérées automatiquement par le gestionnaire d'entités JPA.

En résumé, la logique du JPA repose sur la création de classes d'entités Java annotées, la gestion des opérations CRUD par le gestionnaire d'entités JPA, la synchronisation automatique de l'état des entités avec la base de données et la gestion des relations entre les entités.
## Le contexte generale de l'application
L'idée de cette application est de créer un système de gestion de patients utilisant Spring Boot et JPA pour la persistance des données. L'application permet aux administrateurs de gérer les informations des patients, tandis que les utilisateurs simples peuvent seulement visualiser la liste des patients. Les fonctionnalités principales de l'application incluent l'ajout, la suppression, et la modification des patients, ainsi que l'affichage des patients dans un tableau.
## Les annotation
@Entity : Cette annotation indique que la classe est une entité de base de données. Elle sera utilisée pour créer une table dans la base de données et stocker les données correspondantes.

@Data : Cette annotation est fournie par le framework Lombok et elle génère automatiquement des méthodes getters, setters, equals, hashCode, toString pour tous les champs de la classe. Cela permet de simplifier le code et d'éviter d'écrire ces méthodes manuellement.

@NoArgsConstructor : Cette annotation génère automatiquement un constructeur sans argument pour la classe. Cela permet de créer des instances de la classe sans avoir besoin de passer des arguments.

@AllArgsConstructor : Cette annotation génère automatiquement un constructeur avec tous les arguments de la classe. Cela permet de créer des instances de la classe en passant tous les arguments nécessaires.

@Builder : Cette annotation permet de générer un pattern Builder pour la classe. Le pattern Builder est un moyen de créer des instances de la classe en utilisant une syntaxe plus claire et plus concise.
@Id:Cette annotation @Id est utilisée en programmation orientée objet pour indiquer à un framework de persistance de données que le champ annoté doit être utilisé comme identifiant de l'objet associé.
@ManyToMany(fetch = FetchType.EAGER) est une annotation qui est utilisée dans le contexte de la relation entre deux entités. Elle indique qu'une relation ManyToMany doit être établie entre deux entités et que les données associées à cette relation doivent être chargées immédiatement lors de la requête.

@Column(unique = true) est une annotation utilisée pour spécifier qu'une colonne dans une base de données doit avoir une valeur unique.

@Service est une annotation utilisée pour marquer une classe comme un service. Les services sont des classes qui contiennent la logique métier de l'application.

@Configuration est une annotation utilisée pour marquer une classe comme une classe de configuration. Les classes de configuration sont utilisées pour définir la configuration de l'application.

@EnableWebSecurity est une annotation utilisée pour activer la sécurité Web dans une application Spring.

@EnableMethodSecurity(prePostEnabled = true) est une annotation utilisée pour activer la sécurité au niveau de la méthode dans une application Spring.

@Controller est une annotation utilisée pour marquer une classe comme un contrôleur. Les contrôleurs sont des classes qui gèrent les requêtes HTTP dans une application Web.

@Autowired est une annotation utilisée pour injecter des dépendances dans une classe.

@GetMapping("/user/index") est une annotation utilisée pour mapper une méthode à une requête HTTP GET.

@PreAuthorize("hasRole('ROLE_ADMIN')") est une annotation utilisée pour définir une autorisation préalable requise pour accéder à une méthode ou une page Web.

@PostMapping("/admin/savePatient") est une annotation utilisée pour mapper une méthode à une requête HTTP POST.

@SpringBootApplication est une annotation qui est utilisée pour marquer une classe comme une classe de démarrage pour une application Spring Boot.

## Screenshots
![App Screenshot](/image/Capture%20d'écran%202023-04-29%20002212.png)
![App Screenshot](/image/Capture%20d'écran%202023-04-29%20002346.png)
![App Screenshot](/image/Capture%20d'écran%202023-04-29%20002409.png)
![App Screenshot](/image/Capture%20d'écran%202023-04-29%20002439.png)
![App Screenshot](/image/Patients-Patiens.png)
![App Screenshot](/image/Patients-Patients.png)