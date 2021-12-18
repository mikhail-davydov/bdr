package com.mkhldvdv.bdr.backend.user;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

import static com.mkhldvdv.bdr.backend.common.Constants.ITEM_ID_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.USER;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document(collection = "users")
public class UserItem extends MongoItem {

    @MongoId(FieldType.STRING)
    private String userId = String.format(ITEM_ID_TEMPLATE, USER, UUID.randomUUID());
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String phone;
    @NotBlank
    private String billAddress;

    @Override
    public String itemId() {
        return getUserId();
    }

}
