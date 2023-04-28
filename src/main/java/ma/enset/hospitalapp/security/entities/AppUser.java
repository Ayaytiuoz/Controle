package ma.enset.hospitalapp.security.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AppUser {
    @Id
    private String userId;
    private String username;
    private String password;
    private String email;
    @ManyToMany (fetch = FetchType.EAGER )
    //Crée une table d'association pour associer les utilisateurs et les rôles.
    private List<AppRole> roles;
}
