package ltd.jellyfish.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "documents")
@Data
public class Documents {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String documentPath;

    private String documentCatgory;
}
