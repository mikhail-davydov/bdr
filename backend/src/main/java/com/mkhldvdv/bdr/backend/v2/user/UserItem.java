package com.mkhldvdv.bdr.backend.v2.user;

import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;
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

import static com.mkhldvdv.bdr.backend.v2.common.Constants.USER;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document(collection = "users")
public class UserItem extends MongoItem {

    @MongoId(FieldType.STRING)
    private String userId = UUID.randomUUID().toString();
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
//    @Email
    private String email;
    @NotBlank
    private String phone;
    @NotBlank
    private String billAddress;

    @Override
    public String getItemId() {
        return getUserId();
    }

    @Override
    public String getItemName() {
        return USER;
    }

}
