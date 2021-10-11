package zw.dreamhub.images.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/11
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Files {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;
    private String description;

    @Lob
    byte[] file;

    @CreationTimestamp
    private LocalDateTime dateCreated;

    public Files(String name, String description, byte[] file) {
        this.name = name;
        this.description = description;
        this.file = file;
    }
}
