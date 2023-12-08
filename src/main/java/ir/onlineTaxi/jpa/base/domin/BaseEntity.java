package ir.onlineTaxi.jpa.base.domin;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class BaseEntity<ID extends Serializable> {
    @Id @GeneratedValue
    ID id;
}
