package ma.enset.hospitalapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity //Cette annotation indique que la classe est une entité de base de données. Elle sera utilisée pour créer une table dans la base de données et stocker les données correspondantes
@Data //Cette annotation est fournie par le framework Lombok et elle génère automatiquement des méthodes getters, setters, equals, hashCode, toString pour tous les champs de la classe. Cela permet de simplifier le code et d'éviter d'écrire ces méthodes manuellement
@NoArgsConstructor // Cette annotation génère automatiquement un constructeur sans argument pour la classe. Cela permet de créer des instances de la classe sans avoir besoin de passer des arguments.
@AllArgsConstructor // Cette annotation génère automatiquement un constructeur avec tous les arguments de la classe. Cela permet de créer des instances de la classe en passant tous les arguments nécessaires.
@Builder //Cette annotation permet de générer un pattern Builder pour la classe. Le pattern Builder est un moyen de créer des instances de la classe en utilisant une syntaxe plus claire et plus concise.
public class Patient {
    @Id //Cette annotation @Id est utilisée en programmation orientée objet pour indiquer à un framework de persistance de données que le champ annoté doit être utilisé comme identifiant de l'objet associé.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty @Size(min = 4, max = 20)
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    @Min(10)
    private int score;
}
