package com.restful.dto.supplier;

import com.restful.entity.enumerator.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateSupplierRequestDto {

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Email(message = "Email must valid format")
    @NotBlank(message = "Email must not be blank")
    private String email;

    @NotNull(message = "Gender can not null")
    private Gender gender;

    @NotBlank(message = "Mobile phone must not be blank")
    private String mobilePhone;

    @NotBlank(message = "Street must not be blank")
    private String street;

    @NotBlank(message = "Postal code must not be blank")
    private String postalCode;

    @NotBlank(message = "Kelurahan ID must not be blank")
    private String kelurahanId;
}
