package Repository.model;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Annotation @Data from library lombok add getter and setter adds to all fields of class
 */
@Data
public class Phone {

    private int id;

    private BigDecimal prise;

    private Timestamp saleDate;

    private PhoneModel phoneModel;

    private int ownerId;
}
